package com.yuzw.factory.simple_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class BmwCar implements ICar {
    private String name;

    public BmwCar(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void carName() {
        System.out.println(name);
    }
}
