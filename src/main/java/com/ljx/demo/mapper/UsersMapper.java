package com.ljx.demo.mapper;


import com.ljx.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface UsersMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    Users selectByPrimaryKey(Long id);

    int update(Users record);

    Users selectByEmail(String email);

    List<Users> selectAll();
}