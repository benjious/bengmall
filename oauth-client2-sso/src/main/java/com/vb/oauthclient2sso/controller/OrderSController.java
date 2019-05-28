package com.vb.oauthclient2sso.controller;
import com.vb.oauthclient2sso.entity.Order;
import com.vb.oauthclient2sso.service.GoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderSController {
    @Autowired
    private GoodDetailService mGoodDetailService;

    @RequestMapping("/oc2/order/para")
    public Order getPara(@RequestParam String name){
        return mGoodDetailService.para(name);
    }

    @RequestMapping("/oc2/order/test")
    public Order test(){
        System.out.println("xyz : "+"oauth-client2-sso");
        return mGoodDetailService.test();
    }

    @RequestMapping("oc2/order/getorder")
   public Order getOrder(@RequestHeader int age, @RequestHeader String name){
        return mGoodDetailService.getOrder(age, name);
    }

    @RequestMapping("oc2/order/hello")
    public String hello(@RequestBody Order order){
        return mGoodDetailService.hello(order);
    }



}
