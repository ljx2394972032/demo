package com.ljx.demo.controller;

import com.ljx.demo.model.User;
import com.ljx.demo.response.ResponseEntity;
import com.ljx.demo.response.ResponseMoreEntity;
import com.ljx.demo.utils.MakeOrderNum;
import com.ljx.demo.utils.wechatUtils.WxConfigUtil;
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

    @RequestMapping(value = "/share", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> share(HttpServletRequest request) {
        String urlTemp = "http://" + request.getServerName() + request.getContextPath();
        String urlpath = "http://" + request.getServerName();
        String appUrl = request.getParameter("url");
        if (request.getParameter("code") != null) {
            appUrl += "&code=" + request.getParameter("code");
        }
        if (request.getParameter("state") != null) {
            appUrl += "&state=" + request.getParameter("state");
        }
        return WxConfigUtil.getSignature(appUrl, "自己的appid", "自己的secret", urlTemp, urlpath);
    }
}
