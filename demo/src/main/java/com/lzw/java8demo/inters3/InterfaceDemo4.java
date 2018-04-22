package com.lzw.java8demo.inters3;

/**
 * 定义一个接口
 * java8中的接口中还可以声明静态方法
 */
public interface InterfaceDemo4 {

    default void run(){
        System.out.println("InterfaceDemo4 ==> method run() has been called!");
    }

    //接口中还可以声明静态方法
    static void start(){
        System.out.println("InterfaceDemo4 ==> method start() has been called!");
    }

}
