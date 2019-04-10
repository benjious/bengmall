package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodStore;
import com.vb.seckillserver.entity.good.GoodStoreExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodStoreMapper {
    long countByExample(GoodStoreExample example);

    int deleteByExample(GoodStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodStore record);

    int insertSelective(GoodStore record);

    List<GoodStore> selectByExample(GoodStoreExample example);

    GoodStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodStore record, @Param("example") GoodStoreExample example);

    int updateByExample(@Param("record") GoodStore record, @Param("example") GoodStoreExample example);

    int updateByPrimaryKeySelective(GoodStore record);

    int updateByPrimaryKey(GoodStore record);
}