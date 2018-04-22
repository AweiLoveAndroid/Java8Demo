package com.lzw.java8demo.inters2;

/**
 * 定义一个接口
 */
public interface InterfaceDemo3 {

    default void run(){
        System.out.println("InterfaceDemo3 ==> method run() has been called!");
    }

}
