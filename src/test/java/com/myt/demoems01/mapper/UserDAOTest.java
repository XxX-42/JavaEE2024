package com.myt.demoems01.mapper;

import com.myt.demoems01.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
class UserDAOTest {

    @Autowired//(required = false)
    //@Resource
    private UserDAO userDAO;

    @Test
    void findByUsernameAndPassword() {
        User fhzheng = userDAO.findByUsernameAndPassword("fhzheng", "123456");
        log.info(fhzheng.toString());
    }
}