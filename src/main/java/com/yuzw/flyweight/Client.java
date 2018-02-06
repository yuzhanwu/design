package com.yuzw.flyweight;

/**
 * 面向对象技术可以很好地解决一些灵活性或可扩展性问题，
 * 但在很多情况下需要在系统中增加类和对象的个数。当对象数量太多时，将导致运行代价过高，带来性能下降等问题
 * 享元模式通过共享技术实现相同或相似对象的重用
 * Created by yuzhanwu.
 * Created on 2018/2/6.
 */
public class Client {
    public static void main(String[] args) {
        Flyweight fly = FlyweightFactory.getFlyweight("a");
        fly.operation("First Call");
        fly = FlyweightFactory.getFlyweight("b");
        fly.operation("Second Call");
    }
}
