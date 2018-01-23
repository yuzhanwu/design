package com.yuzw.single;

/**
 * 静态内部类
 * 定义一个私有的内部类，在第一次用这个嵌套类时，会创建一个实例。而类型为SingletonHolder的类，只有在Singleton.getInstance()中调用，
 * 由于私有的属性，他人无法使用SingleHolder，不调用Singleton.getInstance()就不会创建实例
 * Created by yuzhanwu.
 * Created on 2018/1/23.
 */
public class SingletonInnerClass {
    private SingletonInnerClass(){

    }
    private static class SingletonHolder{
        private final static SingletonInnerClass instance=new SingletonInnerClass();
    }
    public static SingletonInnerClass getInstance(){
        return SingletonHolder.instance;
    }
}
