package com.yuzw.decorator;

import com.yuzw.decorator.sample01.Transform;

/**
 * Created by yuzhanwu.
 * Created on 2018/2/5.
 */
public abstract class Decorator implements Component{
    private Component component;
    public Decorator(Component component)
    {
        this.component=component;
    }
    @Override
    public void operation(){
        component.operation();
    }
}
