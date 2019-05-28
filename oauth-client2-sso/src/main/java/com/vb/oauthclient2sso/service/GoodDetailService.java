package com.vb.oauthclient2sso.service;

import com.vb.oauthclient2sso.entity.Order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-service")
public interface GoodDetailService {
    @RequestMapping(value = "/para", method = RequestMethod.GET)
    Order para(@RequestParam String name);

    @RequestMapping(value = "/raw", method = RequestMethod.GET)
    Order test();

    @RequestMapping
    Order getOrder(@RequestHeader int age, @RequestHeader String name);

    @RequestMapping(value = "/reboby", method = RequestMethod.POST)
    String hello(@RequestBody Order order);


}
