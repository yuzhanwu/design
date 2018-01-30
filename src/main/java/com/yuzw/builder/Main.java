package com.yuzw.builder;

/**
 * 四个要素
 产品类：一般是一个较为复杂的对象，也就是说创建对象的过程比较复杂，一般会有比较多的代码量。在本类图中，产品类是一个具体的类，而非抽象类。实际编程中，产品类可以是由一个抽象类与它的不同实现组成，也可以是由多个抽象类与他们的实现组成。
 抽象建造者：引入抽象建造者的目的，是为了将建造的具体过程交与它的子类来实现。这样更容易扩展。一般至少会有两个抽象方法，一个用来建造产品，一个是用来返回产品。
 建造者：实现抽象类的所有未实现的方法，具体来说一般是两项任务：组建产品；返回组建好的产品。
 导演类：负责调用适当的建造者来组建产品，导演类一般不与产品类发生依赖关系，与导演类直接交互的是建造者类。一般来说，导演类被用来封装程序中易变的部分。

 优点，更容易扩展，创建复杂的对象
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        SchoolUser simple = director.getAProduct();
        simple.showProduct();

        SchoolUser mul = director.getBProduct();
        mul.showProduct();
    }
}
