package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.ExpressFrieight;
import com.vb.seckillserver.entity.good.ExpressFrieightExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpressFrieightMapper {
    long countByExample(ExpressFrieightExample example);

    int deleteByExample(ExpressFrieightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpressFrieight record);

    int insertSelective(ExpressFrieight record);

    List<ExpressFrieight> selectByExample(ExpressFrieightExample example);

    ExpressFrieight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpressFrieight record, @Param("example") ExpressFrieightExample example);

    int updateByExample(@Param("record") ExpressFrieight record, @Param("example") ExpressFrieightExample example);

    int updateByPrimaryKeySelective(ExpressFrieight record);

    int updateByPrimaryKey(ExpressFrieight record);
}