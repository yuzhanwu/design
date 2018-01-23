package com.yuzw.factory.method_factory;

import com.yuzw.factory.simple_factory.SimpleFactory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class Client {
    public static void main(String[] args) {
        SingleFactory singleFactory = new SingleFactory();
        IUser singleUser = singleFactory.createUser();
        singleUser.printName();
        MultipleUserFactory multipleUserFactory = new MultipleUserFactory();
        IUser multipleUserFactoryUser = multipleUserFactory.createUser();
        multipleUserFactoryUser.printName();

    }
}
