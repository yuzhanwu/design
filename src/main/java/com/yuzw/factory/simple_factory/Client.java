package com.yuzw.factory.simple_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class Client {
    public static void main(String[] args) {
        ICar bmw = SimpleFactory.createCar(CarType.BMW);
        ICar benz = SimpleFactory.createCar(CarType.BENZ);
        bmw.carName();;
        benz.carName();
        ICar invokeBenz = SimpleInvokeFactory.createCar(BenzCar.class);
        ICar invokeBmw = SimpleInvokeFactory.createCar(BmwCar.class);
        invokeBenz.carName();
        invokeBmw.carName();
    }
}
