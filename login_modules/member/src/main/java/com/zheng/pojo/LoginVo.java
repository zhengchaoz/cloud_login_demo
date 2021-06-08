package com.zheng.pojo;

import java.util.StringJoiner;

/**
 * @author 郑超
 * @create 2021/6/8
 */
public class LoginVo {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", LoginVo.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
