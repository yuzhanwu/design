package com.yuzw.singleton;

import com.yuzw.DesignApplicationTests;
import com.yuzw.single.Singleton;
import org.junit.Test;

/**
 * Created by yuzhanwu.
 * Created on 2018/1/23.
 */
public class SingletonTest extends DesignApplicationTests{

    @Test
    public void testSingleton(){
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode()+":"+singleton1.hashCode());
    }
}
