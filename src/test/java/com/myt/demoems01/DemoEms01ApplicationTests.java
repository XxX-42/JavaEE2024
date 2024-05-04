package com.myt.demoems01;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.myt.demoems01.mapper")
class DemoEms01ApplicationTests {

    @Test
    void contextLoads() {
    }

}
