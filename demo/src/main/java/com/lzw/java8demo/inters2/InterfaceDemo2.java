package com.lzw.java8demo.inters2;

/**
 * 定义一个接口
 */
public interface InterfaceDemo2 {

    default void run(){
        System.out.println("InterfaceDemo2 ==> method run() has been called!");
    }

}
