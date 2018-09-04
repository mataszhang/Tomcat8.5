package com.matas.digester.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author matas
 * @date 2018/9/3 17:50
 * @email mataszhang@163.com
 */
public class Department {
    private String name;
    private String code;
    private Pc pc;
    private List<User> users = new ArrayList<>();
    private Map<String, String> props = new HashMap<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public void putProps(String k, String v) {
        this.props.put(k, v);
    }

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, String> getProps() {
        return props;
    }

    public void setProps(Map<String, String> props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", pc=" + pc +
                ", users=" + users +
                ", props=" + props +
                '}';
    }

    public Pc getPc() {
        return pc;
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }
}
