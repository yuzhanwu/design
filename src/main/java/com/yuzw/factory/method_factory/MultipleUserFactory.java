package com.yuzw.factory.method_factory;

/**
 * Created by yzw19 on 2018/1/23.
 */
public class MultipleUserFactory extends IUserFactory{
    @Override
    public IUser createUser() {
        return new MultipleUser();
    }
}
