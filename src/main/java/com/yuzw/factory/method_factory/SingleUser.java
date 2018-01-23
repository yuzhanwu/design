package com.yuzw.factory.method_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class SingleUser extends User implements IUser {

    @Override
    public void printName() {
        System.out.println("创建单账号");
    }
}
