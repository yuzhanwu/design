package com.yuzw.factory.simple_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public enum CarType {
    BMW(1,"宝马"),BENZ(2,"奔驰");
    // 成员变量
    private String name;
    private int index;

    CarType(int index,String name) {
        this.name = name;
        this.index = index;
    }


    // 普通方法
    public static String getName(int index) {
        for (CarType c : CarType.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
