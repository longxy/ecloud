package com.infosoul.domain;

/**
 * 用户实体类
 *
 * @author longxy
 * @version V1.0
 * @date 2016-11-04 11:14
 */
public class User {

    private Long id;

    private String name;

    private Integer age;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
