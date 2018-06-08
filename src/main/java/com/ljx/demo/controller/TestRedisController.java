package com.ljx.demo.controller;

import com.ljx.demo.entity.Users;
import com.ljx.demo.mapper.UsersMapper;
import com.ljx.demo.service.RedisUtils;
import com.ljx.demo.service.Sender;
import com.ljx.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestRedisController {

    @Autowired
    private TestService testService;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private Sender sender;

    @RequestMapping("redis")
    public Users redis(Long id) {
        return testService.selectById(id);
    }

    @RequestMapping("redis1")
    public List<Users> redis1() {
        List<Users> users;
        Object obj = redisUtils.getSerial("usersTest");
        if (obj == null) {
            System.out.println("空的");
            users = usersMapper.selectAll();
            redisUtils.setSerial("usersTest", users, 3600);
        } else {
            if (obj instanceof ArrayList<?>) {
                users = (ArrayList<Users>) obj;
            } else {
                System.out.println("查询数据库");
                users = usersMapper.selectAll();
                redisUtils.setSerial("usersTest", users, 3600);
            }
        }
        return users;
    }

    @RequestMapping("redis2")
    public void redis2() {
        Users users = new Users();
        users.setId(1L);
        users.setFirstName("1");
        testService.update(users);
    }

    @RequestMapping("mq")
    public String mq() throws Exception {
        while (true) {
            String msg = new Date().toString() + "啦啦啦啦消息";
            sender.send(msg);
            Thread.sleep(1000);
        }
    }
}
