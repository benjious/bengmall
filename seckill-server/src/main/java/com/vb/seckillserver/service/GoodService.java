package com.vb.seckillserver.service;


import com.vb.seckillserver.entity.good.GoodCategory;
import com.vb.seckillserver.entity.good.GoodProduct;
import com.vb.seckillserver.entity.good.GoodStore;
import com.vb.seckillserver.entity.good.GoodType;
import com.vb.seckillserver.entity.good.ProductBrank;
import com.vb.seckillserver.web.bean.GoodBean;

import java.util.List;

public interface GoodService {
    List<GoodCategory> getAllGoodCatory();
    List<ProductBrank> getAllGoodBrand();
    List<GoodStore> getAllGoodStore();
    List<GoodType> getAllGoodType();
    List<GoodBean> getGoodProSkuByCateId(int categoryId);
    List<GoodBean> getGoodProSkuByBrandId(int brandId);
    boolean createProduct(GoodProduct product);
}
