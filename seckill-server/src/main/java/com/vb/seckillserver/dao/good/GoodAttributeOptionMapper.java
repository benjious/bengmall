package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodAttributeOption;
import com.vb.seckillserver.entity.good.GoodAttributeOptionExample;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodAttributeOptionMapper {
    long countByExample(GoodAttributeOptionExample example);

    int deleteByExample(GoodAttributeOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodAttributeOption record);

    int insertSelective(GoodAttributeOption record);

    List<GoodAttributeOption> selectByExample(GoodAttributeOptionExample example);

    GoodAttributeOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodAttributeOption record, @Param("example") GoodAttributeOptionExample example);

    int updateByExample(@Param("record") GoodAttributeOption record, @Param("example") GoodAttributeOptionExample example);

    int updateByPrimaryKeySelective(GoodAttributeOption record);

    int updateByPrimaryKey(GoodAttributeOption record);
}