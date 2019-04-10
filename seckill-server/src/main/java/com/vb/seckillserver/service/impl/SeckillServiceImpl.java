package com.vb.seckillserver.service.impl;
import com.vb.seckillserver.dao.seckill.SeckillDao;
import com.vb.seckillserver.dao.seckill.SuccessKilledDao;
import com.vb.seckillserver.dto.Exposer;
import com.vb.seckillserver.dto.SeckillExecution;
import com.vb.seckillserver.dto.SeckillStatEnum;
import com.vb.seckillserver.entity.seckill.Seckill;
import com.vb.seckillserver.entity.seckill.SuccessKilled;
import com.vb.seckillserver.exception.SeckillCloseException;
import com.vb.seckillserver.exception.SeckillException;
import com.vb.seckillserver.exception.SeckillRepeatException;
import com.vb.seckillserver.service.SeckillService;

import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class SeckillServiceImpl implements SeckillService {

    private Logger mLogger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillDao mSeckillDao;
    @Autowired
    private SuccessKilledDao mSuccessKilledDao;

//    @Autowired
//    private RedisOperator<Seckill> mRedisDao;

    private final String salt = "fjo55fqe8w91fqe";

    @Override
    public List<Seckill> getAllSeckill() {
        return mSeckillDao.queryAllSeckill(0, 100);
    }

    @Override
    public Seckill getSeckillById(long seckillId) {
        Seckill seckill = mSeckillDao.querySeckillById(seckillId);
        return seckill;
    }

    //用户想获取某个秒杀商品的信息
    @Override
    public Exposer exportSecillUrl(long seckillId) {
//        //先在缓冲中查找，然后再在数据库中查找
//
//        Seckill seckill = mRedisDao.getObject(String.valueOf(seckillId));
//        if (seckill == null) {
//            //缓冲中没有
//            seckill = mSeckillDao.querySeckillById(seckillId);
//            if (seckill == null) {
//                mRedisDao.putObject(String.valueOf(seckill.getSeckillId()),seckill);
//                mLogger.debug("这里是null!");
//                return new Exposer(false, seckillId);
//            }
//        }
//
//        Date startTime = seckill.getStartTime();
//        Date endTime = seckill.getEndTime();
//        Date now = new Date();
//        String md5 = generateMd5(seckill.getSeckillId());
//        if (!(now.getTime() > startTime.getTime() && now.getTime() < endTime.getTime())) {
//            return new Exposer(false, seckillId, now.getTime(), startTime.getTime(), endTime.getTime());
//        }
        return new Exposer(true, seckillId, "11");
    }

    private String generateMd5(long seckilled) {
        String base = seckilled + "/" + salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;

    }

    //成功秒杀，现在交给服务器执行秒杀操作
    @Transactional
    @Override
    public SeckillExecution seckillExcution(long seckillId, long usrPhone, String md5) throws SeckillException, SeckillRepeatException, SeckillCloseException {

        if (md5 == null || !md5.equals(generateMd5(seckillId))) {
            throw new SeckillException("the date is rewrote");
        }

        Date now = new Date();
        try {
            //插入数据，返回成功秒杀对象
            int result = mSuccessKilledDao.insertSuccessKill(seckillId, usrPhone);
            if (result <= 0) {
                throw new SeckillRepeatException("the date is repeated ");
            }

            //减库存
            int updateResult = mSeckillDao.reduceNumber(seckillId, now);
            if (updateResult <= 0) {
                throw new SeckillCloseException("the secill is closed");
            } else {
                SuccessKilled successKilled = mSuccessKilledDao.querySuccessSeckillById(seckillId, usrPhone);
                return new SeckillExecution(seckillId, SeckillStatEnum.SUCCESS, successKilled);
            }

        } catch (SeckillRepeatException | SeckillCloseException e1) {
            throw e1;
        } catch (Exception e) {
            throw new SeckillException("seckillExecution inner err !" + e.getMessage());
        }
    }

    @Override
    public SeckillExecution seckillExcutionProcedure(long seckillId, long usePhone, String md5) {
        if (md5 == null || !md5.equals(generateMd5(seckillId))) {
            throw new SeckillException("the date is rewrote");
        }

        Date now = new Date();
        Map<String, Object> map = new HashMap<>();
        map.put("seckillId", seckillId);
        map.put("phone", usePhone);
        map.put("killTime", now);
        map.put("result", null);
        try {
            mSeckillDao.killByProcedure(map);
            Integer result = MapUtils.getInteger(map, "result", -2);
            if (result == 1) {
                SuccessKilled sk = mSuccessKilledDao.querySuccessSeckillById(seckillId, usePhone);
                return new SeckillExecution(seckillId, SeckillStatEnum.SUCCESS, sk);
            } else {
                return new SeckillExecution(seckillId, SeckillStatEnum.stateOf(result));
            }

        } catch (Exception e) {
            mLogger.error(e.getMessage(), e);
            return new SeckillExecution(seckillId, SeckillStatEnum.INNER_ERROR);
        }
    }
}
