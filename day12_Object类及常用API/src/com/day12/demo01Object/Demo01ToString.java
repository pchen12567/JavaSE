package com.day12.demo01Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object
    类 Object 是类层次结构的根(父)类。
    每个类(Person,Student...)都使用 Object 作为超(父)类。
    所有对象（包括数组）都实现这个类的方法。
 */
public class Demo01ToString {

    public static void main(String[] args) {
        /*
            Person类默认继承了Object类,所以可以使用Object类中的toString方法
            String toString() 返回该对象的字符串表示。
        */
        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s);

        //直接打印对象的名字,其实就是调用对象的toString  p=p.toString();
        System.out.println(p);

        /*
            看一个类是否重写了toString,直接打印这个类的对象即可,
            如果没有重写toString方法那么打印的是对象的地址值(默认）
            如果重写toString方法，那么久按照重写的方式打印
        */
        Random r = new Random();
        System.out.println(r); // 没有重写toString方法

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); // 重写toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list); // 重写toString方法



    }
}
