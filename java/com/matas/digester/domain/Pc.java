package com.matas.digester.domain;

/**
 *
 *@author matas
 *@date  2018/9/4 17:01
 *@email   mataszhang@163.com
 */
public class Pc {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "code='" + code + '\'' +
                '}';
    }
}
