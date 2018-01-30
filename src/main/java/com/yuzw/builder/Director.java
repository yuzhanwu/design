package com.yuzw.builder;

/**
 * 导演类
 * 封装易变的地方
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class Director {
    private Builder builder = new ConcreteBuilder();
    public SchoolUser getAProduct(){
        builder.setPart("单账号","6");
        return builder.getSchoolUser();
    }
    public SchoolUser getBProduct(){
        builder.setPart("mul","0");
        return builder.getSchoolUser();
    }
}
