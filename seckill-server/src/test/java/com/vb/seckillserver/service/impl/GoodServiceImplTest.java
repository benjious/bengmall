package com.vb.seckillserver.service.impl;

import com.vb.seckillserver.entity.good.GoodCategory;
import com.vb.seckillserver.service.GoodService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodServiceImplTest {

    @Autowired
    private GoodService mGoodService;


    @Test
    public void getAllGoodCatory() {
        List<GoodCategory> allGoodCatory = mGoodService.getAllGoodCatory();
        for (GoodCategory category : allGoodCatory) {
            System.out.println("xyz ；"+category.getName());
        }
    }
}