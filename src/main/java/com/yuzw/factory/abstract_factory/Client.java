package com.yuzw.factory.abstract_factory;

/**
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
