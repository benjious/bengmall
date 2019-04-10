package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodCategory;
import com.vb.seckillserver.entity.good.GoodCategoryExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodCategoryMapper {
    long countByExample(GoodCategoryExample example);

    int deleteByExample(GoodCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodCategory record);

    int insertSelective(GoodCategory record);

    List<GoodCategory> selectByExample(GoodCategoryExample example);

    GoodCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodCategory record, @Param("example") GoodCategoryExample example);

    int updateByExample(@Param("record") GoodCategory record, @Param("example") GoodCategoryExample example);

    int updateByPrimaryKeySelective(GoodCategory record);

    int updateByPrimaryKey(GoodCategory record);
}