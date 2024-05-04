package com.myt.demoems01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private String id;			// 序号
    private String username;	// 用户姓名
    private String realname;	// 真实姓名
    private String password;	// 用户密码
    private String gender;			// 用户性别

}