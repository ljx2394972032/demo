package com.ljx.demo.mapper;


import com.ljx.demo.entity.Users;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface UsersMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    @Cacheable(value = "thisredis", key = "'users_'+#id")
    Users selectByPrimaryKey(Long id);

    int update(Users record);

    Users selectByEmail(String email);

    List<Users> selectAll();
}