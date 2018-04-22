package com.lzw.java8demo.inters4;

/**
 * 定义一个接口
 * java8中的 函数式接口FunctionInterface
 * Java8最大的变化是引入了函数式思想，也就是说函数可以作为另一个函数的参数。
 * 函数式接口，要求接口中有且仅有一个抽象方法
 *
 * 【使用函数式接口FunctionInterface：】
 *   可以使用@FunctionalInterface注解，声明一个接口是函数式接口。
 *   如果一个接口满足函数式接口的定义，会默认转换成函数式接口。
 */

/**
 * 该接口只有一个抽象方法，并且使用注解显式声明。
 */
@java.lang.FunctionalInterface
public interface InterfaceDemo5 {

    /**
     *  函数式接口只能有一个抽象方法
     */
    void handle();

    /**
     * 函数式接口可以拥有若干个默认方法的（实例方法）
     */
    default void run() {
        System.out.println("InterfaceDemo5 ==> method run() has been called!");
    }

}
