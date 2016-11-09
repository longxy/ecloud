package com.infosoul.domain;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author longxy
 * @version V1.0
 * @date 2016-11-04 11:14
 */
public class Person implements Serializable{

    private static final long serialVersionUID = -1L;

    private String name;

    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
