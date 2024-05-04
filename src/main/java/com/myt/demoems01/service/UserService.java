package com.myt.demoems01.service;

import com.myt.demoems01.entity.User;

public interface UserService {
    //保存用户
    void save(User user);
    //登录
    User login(String username,String password);
}