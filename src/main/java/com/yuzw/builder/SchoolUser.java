package com.yuzw.builder;

/**
 * 产品类
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class SchoolUser {
    private Integer userId;
    private String userName;
    private String userType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    public void showProduct(){
        System.out.println(userName+userType);
    }
}
