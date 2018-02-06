package com.yuzw.facade.sample;

/**
 * 电灯
 * Created by yuzhanwu.
 * Created on 2018/2/6.
 */
public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }
    public void on(){
        System.out.println(this.position+"灯打开");
    }
    public void off(){
        System.out.println(this.position+"灯关闭");
    }
}
