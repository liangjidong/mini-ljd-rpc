package com.ljd.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liangjidong <liangjidong@kuaishou.com>
 * Created on 2021-08-08
 */
public class Test {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 100; i++) {
            n = grow(n + 1, n);
            System.out.println(n);
        }
    }

    private static void test() {

        test1(new ArrayList<Object>());
        test1(new ArrayList<Integer>());
        test1(new ArrayList<Number>());
        test1(new ArrayList<Comparable<?>>());
        test1(new ArrayList<Serializable>());
        List<Integer> a = new ArrayList<>();
        a.add(new Integer(1));
        Object integer = a.get(0);

        Collections.copy(new ArrayList<Number>(), new ArrayList<Integer>());
        Arrays.sort(new int[9]);
//        Collections.sort(new ArrayList<>());

    }

    // list中的类型必须是Integer的父类型
    //
    private static void test1(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        Object object = list.get(0);
        System.out.println(list.get(1));
        System.out.println(object);
    }

    public static int grow(int minCapacity, int oldCapacity) {
        // overflow-conscious code
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        return newCapacity;
    }

    public static int computeDuration(int duration) {
        if (duration < 1) {
            return 1;
        } else if (duration < 20) {
            return duration;
        } else if (duration < 200) {
            return duration - duration % 5;
        } else if (duration < 500) {
            return duration - duration % 20;
        } else if (duration < 2000) {
            return duration - duration % 50;
        } else if (duration < 20000) {
            return duration - duration % 500;
        } else if (duration < 1000000) {
            return duration - duration % 10000;
        } else {
            int dk = 524288;

            if (duration > 3600 * 1000) {
                dk = 3600 * 1000;
            } else {
                while (dk < duration) {
                    dk <<= 1;
                }
            }
            return dk;
        }
    }

}
