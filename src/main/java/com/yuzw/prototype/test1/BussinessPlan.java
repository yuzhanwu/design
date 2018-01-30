package com.yuzw.prototype.test1;

/**
 * Created by yuzhanwu.
 * Created on 2018/1/30.
 */
public class BussinessPlan implements Cloneable{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public BussinessPlan clone(){
        BussinessPlan plan=null;
        try
        {
            plan=(BussinessPlan)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
        }
        return plan;
    }
}
