package com.vb.seckillserver.service;


import com.vb.seckillserver.dto.Exposer;
import com.vb.seckillserver.dto.SeckillExecution;
import com.vb.seckillserver.entity.seckill.Seckill;

import java.util.List;

public interface SeckillService {

    List<Seckill> getAllSeckill();
    Seckill getSeckillById(long seckillId);

    /**
     *
     /**
     * 在秒杀开启时输出秒杀接口的地址，否则输出系统时间和秒杀时间
     * @param seckillId 要秒杀的商品
     * @return 显示秒杀商品内容SeckillServiceImpl
     */
    Exposer exportSecillUrl(long seckillId);

    SeckillExecution seckillExcution(long seckillId, long usrPhone, String md5);

    SeckillExecution seckillExcutionProcedure(long seckillId, long usrPhone, String md5);


}
