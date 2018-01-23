package com.yuzw.single;

/**
 * 加同步锁时，前后两次判断实例是否存在
 * 缺点 用双重if判断，复杂，容易出错
 * Created by yuzhanwu.
 * Created on 2018/1/23.
 */
public class DoubleJudgeSingleton {
    private static DoubleJudgeSingleton instance = null;
    private DoubleJudgeSingleton(){};
    public static DoubleJudgeSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleJudgeSingleton.class){
                if(instance == null) {
                    instance = new DoubleJudgeSingleton();
                }
            }
        }
        return  instance;
    }
}
