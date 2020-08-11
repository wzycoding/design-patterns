package com.wzy.structural.strategy;

/**
 * @author wzy
 * @date 2020/8/4 12:04
 **/
public class User {
    private String name;
    private Boolean ordered;
    private Boolean vip;

    public User(String name, Boolean ordered, Boolean vip) {
        this.name = name;
        this.ordered = ordered;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(Boolean ordered) {
        this.ordered = ordered;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ordered=" + ordered +
                ", vip=" + vip +
                '}';
    }
}
