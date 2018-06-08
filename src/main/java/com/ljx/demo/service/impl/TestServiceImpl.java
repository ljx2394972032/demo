package com.ljx.demo.service.impl;

import com.ljx.demo.entity.Users;
import com.ljx.demo.mapper.UsersMapper;
import com.ljx.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    @Cacheable(value = "test", key = "'users_'+#id")
    public Users selectById(Long id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    @CacheEvict(value = "test", key = "'users_'+#users.id")
    public int update(Users users) {
        usersMapper.update(users);
        return 0;
    }

}
