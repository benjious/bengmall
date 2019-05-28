package com.vb.oauthclient2sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/coo")
public class CouponController {

    /**
     * 会员列表页面
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        return new ModelAndView("coupon/list");
    }

}
