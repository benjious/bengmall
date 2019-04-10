package com.vb.seckillserver.web;



import com.vb.seckillserver.entity.good.GoodCategory;
import com.vb.seckillserver.entity.good.GoodProduct;
import com.vb.seckillserver.entity.good.GoodStore;
import com.vb.seckillserver.entity.good.GoodType;
import com.vb.seckillserver.entity.good.ProductBrank;
import com.vb.seckillserver.service.GoodService;
import com.vb.seckillserver.util.LogUtil;
import com.vb.seckillserver.web.bean.GoodBean;
import com.vb.seckillserver.web.bean.Result;
import com.vb.seckillserver.web.util.ResultUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



@RestController
@RequestMapping("/bengmall/good")
public class BengmallGoodController {
    @Autowired
    private GoodService mService;

    //所有类目
    @RequestMapping(value = "/product/category/list")
    public Result<List<GoodCategory>> getAllCategory() {
        List<GoodCategory> categories = mService.getAllGoodCatory();
        return new ResultUtil<List<GoodCategory>>().setResult(categories);
    }

    @RequestMapping(value = "/product/brand/list")
    public Result<List<ProductBrank>> getAllBrand() {
        List<ProductBrank> brands = mService.getAllGoodBrand();
        return new ResultUtil<List<ProductBrank>>().setResult(brands);
    }


    @RequestMapping(value = "/product/store/list")
    public Result<List<GoodStore>> getAllStore() {
        List<GoodStore> brands = mService.getAllGoodStore();
        return new ResultUtil<List<GoodStore>>().setResult(brands);
    }

    @RequestMapping(value = "/product/type/list")
    public Result<List<GoodType>> getAllType() {
        List<GoodType> types = mService.getAllGoodType();
        return new ResultUtil<List<GoodType>>().setResult(types);
    }


    //根据类目查找商品
    @RequestMapping(value = "/product/category/{category}")
    public Result<List<GoodBean>> getGoodProSkuByCateId(@PathVariable("category") int categoryId) {
        List<GoodBean> goodBeans = mService.getGoodProSkuByCateId(categoryId);
        return new ResultUtil<List<GoodBean>>().setResult(goodBeans);
    }


    //根据品牌查找商品
    @RequestMapping(value = "/product/brand/{brand}")
    public Result<List<GoodBean>> getGoodProSkuByBrdId(@PathVariable("brand") int brandId) {
        List<GoodBean> goodBeans = mService.getGoodProSkuByBrandId(brandId);
        return new ResultUtil<List<GoodBean>>().setResult(goodBeans);
    }


    // bigdecimal --- > double
    @RequestMapping(value = "/product/create", method = RequestMethod.POST)
    public Result<Boolean> createProduct(@RequestParam(value = "uploadFiles") MultipartFile[] multipartfiles, HttpServletRequest req) {
        int brandId = Integer.parseInt(req.getParameter("brand"));
        int category = Integer.parseInt(req.getParameter("category"));
        String proName = req.getParameter("proName");
        String proDesc = req.getParameter("proDesc");
        int customerCanBuy = Integer.parseInt(req.getParameter("customerCanBuy"));
        double price = Integer.parseInt(req.getParameter("price"));
        int stock= Integer.parseInt(req.getParameter("stock"));
        int stockWarnning= Integer.parseInt(req.getParameter("stockWarnning"));
        int store = Integer.parseInt(req.getParameter("store"));
        int type= Integer.parseInt(req.getParameter("type"));

        GoodProduct proBean = new GoodProduct();
        proBean.setBrandId(brandId);
        proBean.setCategoryId(category);
        proBean.setIntro(proDesc);
        proBean.setName(proName);
        proBean.setPrice(new BigDecimal(price));
        proBean.setMarketPrice(new BigDecimal(price));
        proBean.setStock(stock);
        proBean.setWarningStock(stockWarnning);
        proBean.setVirtualcanbuy(customerCanBuy);
        proBean.setMerId(store);
        proBean.setTypeId((byte) type);
        proBean.setIntegral(0);
        proBean.setIsPackage("0");
        proBean.setBarcode("123");
        //产品型号
        proBean.setMarque("456");
        proBean.setState(Byte.valueOf("0"));
        proBean.setStatus(Byte.valueOf("0"));
        proBean.setIsIntegral("0");
        proBean.setIntegral(0);
        proBean.setSort(99);
        boolean result = false;
        System.out.println("xyz 接收到上传文件！");
        String savePath = "E:\\";

        if (null != multipartfiles && multipartfiles.length > 0) {
            for (MultipartFile file : multipartfiles) {
                try {
                    //复制文件
                    file.transferTo(new File(savePath + file.getOriginalFilename()));
                    //获取图片的路径（放在static 文件夹下的img）
                    String picUrl= "/img/"+file.getOriginalFilename();
                    proBean.setPictureUrl(picUrl);
                    Date date = new Date();
                    proBean.setCreatedAt(date);
                    //插入数据库
                    mService.createProduct(proBean);
                } catch (Exception e) {
                    LogUtil.getLogger(BengmallGoodController.class).error("为上传的文件创建文件失败！");
                }
            }
             result = true;
        }
        return new ResultUtil<Boolean>().setResult(result);
    }


}
