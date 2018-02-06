package com.yuzw.flyweight;

/**
 * Created by yuzhanwu.
 * Created on 2018/2/6.
 */
public class ConcreteFlyweight implements Flyweight{
    private String intrinsicState;
    public ConcreteFlyweight(String state){
        this.intrinsicState = state;
    }

    @Override
    public void operation(String extrinsicState)
    {
        System.out.println("内部状态"+this.intrinsicState);
        System.out.println("外部状态"+extrinsicState);
    }

}
