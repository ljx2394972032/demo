package com.ljx.demo.controller;

import com.ljx.demo.model.User;
import com.ljx.demo.response.ResponseEntity;
import com.ljx.demo.response.ResponseMoreEntity;
import com.ljx.demo.utils.MakeOrderNum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin
public class TestController {
    @RequestMapping("list")
    public ResponseEntity list() {
        List<User> list = new ArrayList<>();
        User user;
        for (int i = 0; i < 20; i++) {
            user = new User();
            user.setUserName("某某" + (i + 1));
            user.setPwd("12314124");
            user.setAge(new Random().nextInt(10) + 10);
            user.setScore(new Random().nextInt(100));
            list.add(user);
        }
        return ResponseEntity.SUCC().data(list).build();
    }

    @RequestMapping("list1")
    public ResponseMoreEntity list1() {
        List<User> list = new ArrayList<>();
        User user;
        for (int i = 0; i < 20; i++) {
            user = new User();
            user.setUserName("某某" + (i + 1));
            user.setPwd("573768457");
            user.setAge(new Random().nextInt(10) + 10);
            user.setScore(new Random().nextInt(100));
            list.add(user);
        }
        return ResponseMoreEntity.SUCC().data(list).data("time", 123).data("user", 3515).build();
    }

    @RequestMapping("order")
    public ResponseEntity order() {
        return ResponseEntity.SUCC().data(MakeOrderNum.makeOrderNum()).build();
    }

}
