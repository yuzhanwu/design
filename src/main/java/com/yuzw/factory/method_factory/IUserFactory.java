package com.yuzw.factory.method_factory;

/**
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化哪一个。工厂方法让类把实例化推迟到了子类
 * Created by yzw19 on 2018/1/23.
 */
public abstract class IUserFactory {
    public abstract IUser createUser();
}
