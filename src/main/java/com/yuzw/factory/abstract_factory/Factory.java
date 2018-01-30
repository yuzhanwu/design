package com.yuzw.factory.abstract_factory;

/**
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class Factory implements IFactory {
    @Override
    public IProduct1 createProduct1() {
        return new Product1();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2();
    }
}
