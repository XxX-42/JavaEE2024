package com.myt.demoems01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.myt.demoems01.mapper")
public class DemoEms01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEms01Application.class, args);
    }

}
