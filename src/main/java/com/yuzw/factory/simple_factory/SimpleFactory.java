package com.yuzw.factory.simple_factory;

/**
 * 其实也可以将其理解成为一个创建对象的工具类
 * 简单工厂模式
 * Created by yzw19 on 2018/1/23.
 */
public class SimpleFactory {
    public static ICar createCar(CarType type){
        if(type.getIndex() == 1){
            return new BmwCar(type.getName());
        }else if(type.getIndex() == 2){
            return new BenzCar(type.getName());
        }else{
            return null;
        }
    }
}
