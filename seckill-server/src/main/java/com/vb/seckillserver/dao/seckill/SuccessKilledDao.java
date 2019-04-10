package com.vb.seckillserver.dao.seckill;



import com.vb.seckillserver.entity.seckill.SuccessKilled;

import org.apache.ibatis.annotations.Param;

public interface SuccessKilledDao {
    int insertSuccessKill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
   SuccessKilled querySuccessSeckillById(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
