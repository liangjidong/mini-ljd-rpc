package com.ljd.test;

/**
 * @author liangjidong <liangjidong@kuaishou.com>
 * Created on 2021-08-08
 */
public class Son extends Father {
    private int a;

    public static void main(String[] args) {
        Son son = new Son();
        son.methodB();
    }

    Son() {
        System.out.println("son=" + a);
        a = 2;
        System.out.println("son=" + a);
    }

    @Override
    public void methodA() {
        System.out.println("son in methodA=" + a);
    }
}
