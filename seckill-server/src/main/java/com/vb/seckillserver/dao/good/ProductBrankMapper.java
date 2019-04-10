package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.ProductBrank;
import com.vb.seckillserver.entity.good.ProductBrankExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductBrankMapper {
    long countByExample(ProductBrankExample example);

    int deleteByExample(ProductBrankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductBrank record);

    int insertSelective(ProductBrank record);

    List<ProductBrank> selectByExample(ProductBrankExample example);

    ProductBrank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductBrank record, @Param("example") ProductBrankExample example);

    int updateByExample(@Param("record") ProductBrank record, @Param("example") ProductBrankExample example);

    int updateByPrimaryKeySelective(ProductBrank record);

    int updateByPrimaryKey(ProductBrank record);
}