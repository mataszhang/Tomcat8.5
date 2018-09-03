package com.matas.digester.domain;

/**
 * @author matas
 * @date 2018/9/3 17:50
 * @email mataszhang@163.com
 */
public class User {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
