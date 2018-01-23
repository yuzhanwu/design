package com.yuzw.single;

/**
 * 多线程，懒汉式
 * 每次通过getInstance方法得到singleton实例的时候都有一个试图去获取同步锁的过程。而众所周知，加锁是很耗时的
 * Created by yuzhanwu.
 * Created on 2018/1/23.
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){};
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
