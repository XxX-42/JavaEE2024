package com.myt.demoems01.mapper;

import com.myt.demoems01.entity.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper
//@Repository
//@Autowired
public interface UserDAO {

    //保存用户的方法
    void save(User user);

    //登录的方法
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
