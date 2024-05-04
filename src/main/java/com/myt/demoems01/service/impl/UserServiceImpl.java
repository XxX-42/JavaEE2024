package com.myt.demoems01.service.impl;

import com.myt.demoems01.entity.User;
import com.myt.demoems01.mapper.UserDAO;
import com.myt.demoems01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(String username, String password) {
        return userDAO.findByUsernameAndPassword(username,password);
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
    }
}