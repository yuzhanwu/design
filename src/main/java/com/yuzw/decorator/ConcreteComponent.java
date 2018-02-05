package com.yuzw.decorator;

/**
 * Created by yuzhanwu.
 * Created on 2018/2/5.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体构建类");
    }
}
