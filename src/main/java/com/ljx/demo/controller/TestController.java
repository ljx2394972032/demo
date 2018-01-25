package com.ljx.demo.controller;

import com.ljx.demo.model.User;
import com.ljx.demo.response.ResponseEntity;
import com.ljx.demo.response.ResponseMoreEntity;
import com.ljx.demo.utils.MakeOrderNum;
import com.ljx.demo.utils.wechatUtils.wechatShare.WxConfigUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    @RequestMapping("order")
    public ResponseEntity order() {
        return ResponseEntity.SUCC().data(MakeOrderNum.makeOrderNum()).build();
    }

}
