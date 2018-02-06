package com.yuzw.flyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * Created by yuzhanwu.
 * Created on 2018/2/6.
 */
public class FlyweightFactory {
    private static HashMap<String,Object> flyweights = new HashMap<>();
    public static Flyweight getFlyweight(String key)
    {
        if(flyweights.containsKey(key))
        {
            return (Flyweight)flyweights.get(key);
        }
        else
        {
            Flyweight fw = new ConcreteFlyweight(key);
            flyweights.put(key,fw);
            return fw;
        }
    }
}
