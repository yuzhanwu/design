package com.yuzw.decorator;

/**
 * Created by yuzhanwu.
 * Created on 2018/2/5.
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void behaiver(){
        System.out.println("添加的装饰方法");
    }
}
