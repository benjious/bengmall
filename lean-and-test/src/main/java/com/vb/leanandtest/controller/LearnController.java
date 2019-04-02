package com.vb.leanandtest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/fa")
public class LearnController {

    @RequestMapping("/login")
    public String getView(){
        return "login1";

    }
}
