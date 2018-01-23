package com.yuzw.single;

/**
 * 单线程
 * 当两个线程同时运行到判断instance是否为空的if语句，并且instance确实没有创建好时，那么两个线程都会创建一个实例
 * Created by yuzhanwu.
 * Created on 2018/1/23.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
