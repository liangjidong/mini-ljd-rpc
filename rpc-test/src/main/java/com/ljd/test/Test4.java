package com.ljd.test;

/**
 * @author liangjidong <liangjidong@kuaishou.com>
 * Created on 2021-08-08
 */
public class Test4 {
    String  a = "1";
    @Override
    public String toString() {
        if(0==0) {
            int a= 1;
            this.a = "2";
        }
        return super.toString();
    }
}
