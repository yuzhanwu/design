package com.yuzw.factory.simple_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class SimpleInvokeFactory {
    public static ICar createCar(Class<?> clazz){
        if(clazz.getName().equals(BmwCar.class.getName())){
            return new BmwCar(CarType.BMW.getName());
        }else if(clazz.getName().equals(BenzCar.class.getName())){
            return new BenzCar(CarType.BENZ.getName());
        }
        return null;
    }
}
