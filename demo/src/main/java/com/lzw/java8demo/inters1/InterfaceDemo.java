package com.lzw.java8demo.inters1;

/**
 * java8接口的新变化：
 *
 * 接口的默认方法和静态方法
 *
 * 1、在java8中定义接口的默认方法是通过default关键字。
 * 2、在Java8中接口不仅能够包含抽象方法，还能够包含若干个默认方法（即有完整逻辑的实例方法）。
 *
 */
public interface InterfaceDemo {

    //抽象方法
    void start();

    //默认方法
    default void run(){
        System.out.println("InterfaceDemo ==> method run() has been called!");
    }

}
