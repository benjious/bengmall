package com.vb.seckillserver.dao.good;



import com.vb.seckillserver.entity.good.GoodAttribute;
import com.vb.seckillserver.entity.good.GoodAttributeExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodAttributeMapper {
    long countByExample(GoodAttributeExample example);

    int deleteByExample(GoodAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodAttribute record);

    int insertSelective(GoodAttribute record);

    List<GoodAttribute> selectByExample(GoodAttributeExample example);

    GoodAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodAttribute record, @Param("example") GoodAttributeExample example);

    int updateByExample(@Param("record") GoodAttribute record, @Param("example") GoodAttributeExample example);

    int updateByPrimaryKeySelective(GoodAttribute record);

    int updateByPrimaryKey(GoodAttribute record);
}