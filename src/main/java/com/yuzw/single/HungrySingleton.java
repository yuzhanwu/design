package com.yuzw.single;

/**
 * 饿汉式（推荐）
 * 没有lazy loading的效果，从而降低内存的使用率
 * Created by yuzhanwu.
 * Created on 2018/1/23.
 */
public class HungrySingleton {
    private static HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return instance;
    }
}
