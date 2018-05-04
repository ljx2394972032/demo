package com.ljx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

    @RequestMapping("req")
    public String req() {
        System.out.println("jinlai");
        return "redirect:/wechat/fail.html";
    }
}
