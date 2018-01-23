package com.yuzw.factory.method_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class SingleFactory extends IUserFactory{
    @Override
    public IUser createUser() {
        return new SingleUser();
    }
}
