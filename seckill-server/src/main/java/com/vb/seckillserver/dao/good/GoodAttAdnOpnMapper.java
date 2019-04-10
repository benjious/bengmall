package com.vb.seckillserver.dao.good;


import com.vb.seckillserver.entity.good.GoodAttAdnOpn;
import com.vb.seckillserver.entity.good.GoodAttAdnOpnExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodAttAdnOpnMapper {
    long countByExample(GoodAttAdnOpnExample example);

    int deleteByExample(GoodAttAdnOpnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodAttAdnOpn record);

    int insertSelective(GoodAttAdnOpn record);

    List<GoodAttAdnOpn> selectByExample(GoodAttAdnOpnExample example);

    GoodAttAdnOpn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodAttAdnOpn record, @Param("example") GoodAttAdnOpnExample example);

    int updateByExample(@Param("record") GoodAttAdnOpn record, @Param("example") GoodAttAdnOpnExample example);

    int updateByPrimaryKeySelective(GoodAttAdnOpn record);

    int updateByPrimaryKey(GoodAttAdnOpn record);
}