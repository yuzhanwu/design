package com.yuzw.builder;

/**
 * 抽象建造者
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public abstract class Builder {
    public abstract void setPart(String arg1, String arg2);
    public abstract SchoolUser getSchoolUser();
}
