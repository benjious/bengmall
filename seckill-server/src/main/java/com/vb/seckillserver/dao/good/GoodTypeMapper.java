package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodType;
import com.vb.seckillserver.entity.good.GoodTypeExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodTypeMapper {
    long countByExample(GoodTypeExample example);

    int deleteByExample(GoodTypeExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(GoodType record);

    int insertSelective(GoodType record);

    List<GoodType> selectByExample(GoodTypeExample example);

    GoodType selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByExample(@Param("record") GoodType record, @Param("example") GoodTypeExample example);

    int updateByPrimaryKeySelective(GoodType record);

    int updateByPrimaryKey(GoodType record);
}