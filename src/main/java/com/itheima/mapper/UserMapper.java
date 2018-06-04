package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

public interface UserMapper {
    User findUserById(Integer id);

    List<User> findUserByUsername(String username);

    void insertUser(User user);
}
