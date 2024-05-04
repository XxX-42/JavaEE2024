package com.myt.demoems01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Emp implements Serializable {
    private String id;		// 编号
    private String name;	// 姓名
    private Double salary;	// 工资
    private Integer age;	// 年龄
}
