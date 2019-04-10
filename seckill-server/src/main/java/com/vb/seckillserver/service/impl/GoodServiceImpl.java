package com.vb.seckillserver.service.impl;


import com.vb.seckillserver.dao.good.GoodCategoryMapper;
import com.vb.seckillserver.dao.good.GoodProductMapper;
import com.vb.seckillserver.dao.good.GoodProductSkuMapper;
import com.vb.seckillserver.dao.good.GoodStoreMapper;
import com.vb.seckillserver.dao.good.GoodTypeMapper;
import com.vb.seckillserver.dao.good.ProductBrankMapper;
import com.vb.seckillserver.entity.good.GoodCategory;
import com.vb.seckillserver.entity.good.GoodCategoryExample;
import com.vb.seckillserver.entity.good.GoodProduct;
import com.vb.seckillserver.entity.good.GoodProductExample;
import com.vb.seckillserver.entity.good.GoodProductSku;
import com.vb.seckillserver.entity.good.GoodProductSkuExample;
import com.vb.seckillserver.entity.good.GoodStore;
import com.vb.seckillserver.entity.good.GoodStoreExample;
import com.vb.seckillserver.entity.good.GoodType;
import com.vb.seckillserver.entity.good.GoodTypeExample;
import com.vb.seckillserver.entity.good.PostproductBean;
import com.vb.seckillserver.entity.good.ProductBrank;
import com.vb.seckillserver.entity.good.ProductBrankExample;
import com.vb.seckillserver.service.GoodService;
import com.vb.seckillserver.web.bean.GoodBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    private Logger mLogger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private GoodCategoryMapper mGoodCategoryMapper;
    @Autowired
    private ProductBrankMapper mProductBrankMapper;
    @Autowired
    private GoodStoreMapper mGoodStoreMapper;
    @Autowired
    private GoodTypeMapper mGoodTypeMapper;
    @Autowired
    private GoodProductSkuMapper mProductSkuMapper;


    @Autowired
    private GoodProductMapper mGoodProductMapper;



    @Override
    public List<GoodCategory> getAllGoodCatory() {
        GoodCategoryExample example = new GoodCategoryExample();
        example.createCriteria().andIdIsNotNull();
        return mGoodCategoryMapper.selectByExample(example);
    }

    @Override
    public List<ProductBrank> getAllGoodBrand() {
        ProductBrankExample example = new ProductBrankExample();
        example.createCriteria().andIdIsNotNull();
        return mProductBrankMapper.selectByExample(example);

    }

    @Override
    public List<GoodStore> getAllGoodStore() {
        GoodStoreExample example = new GoodStoreExample();
        example.createCriteria().andIdIsNotNull();
        return mGoodStoreMapper.selectByExample(example);
    }

    @Override
    public List<GoodType> getAllGoodType() {
        GoodTypeExample example = new GoodTypeExample();
        example.createCriteria().andIdIsNotNull();
        return mGoodTypeMapper.selectByExample(example);
    }

    @Override
    public List<GoodBean> getGoodProSkuByCateId(int categoryId) {
        List<GoodBean> goodBeans = new ArrayList<>();
        GoodProductExample example = new GoodProductExample();
        example.createCriteria().andCategoryIdEqualTo(categoryId);
        List<GoodProduct> products = mGoodProductMapper.selectByExample(example);
        GeneratGoodBeans(goodBeans, products);
        return goodBeans;
    }

    @Override
    public List<GoodBean> getGoodProSkuByBrandId(int brandId) {
        List<GoodBean> goodBeans = new ArrayList<>();
        GoodProductExample example = new GoodProductExample();
        example.createCriteria().andBrandIdEqualTo(brandId);
        List<GoodProduct> products = mGoodProductMapper.selectByExample(example);
        GeneratGoodBeans(goodBeans, products);
        return goodBeans;

    }

    @Override
    public boolean createProduct(GoodProduct product) {
        int insert = mGoodProductMapper.insert(product);
        if (insert > 0) {
            return true;
        }else{
            return false;
        }
    }

    private void GeneratGoodBeans(List<GoodBean> goodBeans, List<GoodProduct> products) {
        for (GoodProduct product:
                products) {
            GoodProductSkuExample skuExample =new GoodProductSkuExample();
            skuExample.createCriteria().andProductIdEqualTo(product.getId());
            GoodProductSku goodProductSku = mProductSkuMapper.selectByPrimaryKey(product.getId());
            ProductBrank brank = mProductBrankMapper.selectByPrimaryKey(product.getBrandId());
            GoodCategory goodCategory = mGoodCategoryMapper.selectByPrimaryKey(product.getCategoryId());
            GoodStore goodStore = mGoodStoreMapper.selectByPrimaryKey(product.getMerId());
            GoodBean bean = new GoodBean(goodProductSku.getName(),goodProductSku.getImg(),brank.getName(),goodStore.getName(),product.getStatus(),goodCategory.getName(),product.getPrice().doubleValue());
            goodBeans.add(bean);
        }
    }








    private GoodProduct FillDataForProduct(PostproductBean postproductBean) {
        return null;
    }





}
