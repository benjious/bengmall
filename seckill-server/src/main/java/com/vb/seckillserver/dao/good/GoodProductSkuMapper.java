package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodProductSku;
import com.vb.seckillserver.entity.good.GoodProductSkuExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodProductSkuMapper {
    long countByExample(GoodProductSkuExample example);

    int deleteByExample(GoodProductSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodProductSku record);

    int insertSelective(GoodProductSku record);

    List<GoodProductSku> selectByExample(GoodProductSkuExample example);

    GoodProductSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodProductSku record, @Param("example") GoodProductSkuExample example);

    int updateByExample(@Param("record") GoodProductSku record, @Param("example") GoodProductSkuExample example);

    int updateByPrimaryKeySelective(GoodProductSku record);

    int updateByPrimaryKey(GoodProductSku record);
}