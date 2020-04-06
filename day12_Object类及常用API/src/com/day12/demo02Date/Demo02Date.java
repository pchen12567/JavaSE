package com.day12.demo02Date;

import java.util.Date;

public class Demo02Date {

    public static void main(String[] args) {
        demo03();
    }

    /*
        long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    private static void demo03() {
        Date data = new Date();
        long time = data.getTime();
        System.out.println(time); // 1586074692012
    }

    /*
        Date类的带参数构造方法
        Date(long date) :传递毫秒值,把毫秒值转换为Date日期
     */
    private static void  demo02() {
        Date d1 = new Date(0L);
        System.out.println(d1); // Thu Jan 01 08:00:00 CST 1970

        Date d2 = new Date(158111111111L);
        System.out.println(d2); // Sun Jan 05 07:45:11 CST 1975
    }

    /*
        Date类的空参数构造方法
        Date() 获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date); // Sun Apr 05 16:13:45 CST 2020
    }

}
