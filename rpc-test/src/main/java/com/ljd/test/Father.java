package com.ljd.test;

/**
 * @author liangjidong <liangjidong@kuaishou.com>
 * Created on 2021-08-08
 */
public class Father {
    public int a;

    Father() {
        a = 1;
    }

    public void methodA() {
        System.out.println("father in methodA=" + a);
    }

    public void methodB() {
        System.out.println("father in methodB=" + a);
        methodA();
    }
}
