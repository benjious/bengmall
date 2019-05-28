package com.vb.seckillserver.dao.seckill;



import com.vb.seckillserver.entity.seckill.Seckill;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SeckillDao {


    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    Seckill querySeckillById(long seckillId);

    List<Seckill> queryAllSeckill(@Param("offset") int offset, @Param("limit") int limit);

    void killByProcedure(Map<String, Object> paramMap);

}
