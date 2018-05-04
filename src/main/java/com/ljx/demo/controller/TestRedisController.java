package com.ljx.demo.controller;

import com.ljx.demo.entity.Users;
import com.ljx.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestRedisController {

    @Autowired
    private TestService testService;

    @RequestMapping("redis")
    public Users redis(Long id) {
        return testService.selectById(id);
    }
}
