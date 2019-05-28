package com.vb.orderservice.controller;

import com.vb.orderservice.entity.Order;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DetailController {

    @RequestMapping(value = "/para",method = RequestMethod.GET)
    public Order para(@RequestParam  String name){
        return new Order(name, 11);
    }

    @RequestMapping(value = "/raw",method = RequestMethod.GET)
    public Order test(){
        return new Order("这是个没有参数的测试", 11);
    }

    @RequestMapping(value = "/getOrder",method = RequestMethod.GET)
    public Order getOrder(@RequestHeader int age,@RequestHeader String name){
        return new Order(name, age);
    }

    @RequestMapping(value = "/reboby",method = RequestMethod.POST)
    public String hello(@RequestBody Order order){
        return "service requestBody " + order.getName() + "_" + order.getAge();
    }

}
