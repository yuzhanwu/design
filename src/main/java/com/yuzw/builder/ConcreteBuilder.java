package com.yuzw.builder;

/**
 * 建造者
 * 两项任务：组建产品；返回组建好的产品。
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class ConcreteBuilder extends Builder{
    private SchoolUser user = new SchoolUser();
    @Override
    public void setPart(String arg1, String arg2) {
        user.setUserName(arg1);
        user.setUserType(arg2);
    }

    @Override
    public SchoolUser getSchoolUser() {
        return user;
    }
}
