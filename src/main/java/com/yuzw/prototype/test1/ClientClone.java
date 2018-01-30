package com.yuzw.prototype.test1;

/**
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class ClientClone {
    public static void main(String[] args) {
        BussinessPlan planLeader = new BussinessPlan();
        planLeader.setMessage("领导--概述");
        BussinessPlan my = planLeader.clone();
        System.out.println(planLeader==my);
        my.setMessage("自己--概述");
        System.out.println(planLeader.getMessage()+";"+my.getMessage());
    }
}
