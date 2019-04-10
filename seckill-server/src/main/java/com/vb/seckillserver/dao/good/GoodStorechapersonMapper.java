package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodStorechaperson;
import com.vb.seckillserver.entity.good.GoodStorechapersonExample;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodStorechapersonMapper {
    long countByExample(GoodStorechapersonExample example);

    int deleteByExample(GoodStorechapersonExample example);

    int insert(GoodStorechaperson record);

    int insertSelective(GoodStorechaperson record);

    List<GoodStorechaperson> selectByExample(GoodStorechapersonExample example);

    int updateByExampleSelective(@Param("record") GoodStorechaperson record, @Param("example") GoodStorechapersonExample example);

    int updateByExample(@Param("record") GoodStorechaperson record, @Param("example") GoodStorechapersonExample example);
}