package com.yuzw.bridge;

/**
 * 抽象类
 * Created by yuzhanwu.
 * Created on 2018/2/5.
 */
public  abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl)
    {
        this.impl=impl;
    }

    public abstract void operation();
}
