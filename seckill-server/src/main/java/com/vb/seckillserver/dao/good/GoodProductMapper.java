package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodProduct;
import com.vb.seckillserver.entity.good.GoodProductExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodProductMapper {
    long countByExample(GoodProductExample example);

    int deleteByExample(GoodProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodProduct record);

    int insertSelective(GoodProduct record);

    List<GoodProduct> selectByExampleWithBLOBs(GoodProductExample example);

    List<GoodProduct> selectByExample(GoodProductExample example);

    GoodProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodProduct record, @Param("example") GoodProductExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodProduct record, @Param("example") GoodProductExample example);

    int updateByExample(@Param("record") GoodProduct record, @Param("example") GoodProductExample example);

    int updateByPrimaryKeySelective(GoodProduct record);

    int updateByPrimaryKeyWithBLOBs(GoodProduct record);

    int updateByPrimaryKey(GoodProduct record);
}