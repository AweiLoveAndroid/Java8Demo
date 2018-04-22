package com.lzw.java8demo.inters2;

/**
 * java8的新特性的一个demo
 *
 * 实现多个接口，接口里面有相同方法如何处理？
 *
 */
public class DefaultInterfaceTest2 implements InterfaceDemo2, InterfaceDemo3 {

    public static void main(String[] args) {
        /**
         * InterfaceDemo2和InterfaceDemo3这两个接口中都有相同的run方法。
         * DefaultMethodTest2实现了这两个接口，由于这两个接口有相同的方法，因此就会产生冲突，
         * 不知道以哪个接口中的run方法为准，编译会出错：inherits unrelated defaults for run.....
         */
        DefaultInterfaceTest2 defaultMethod = new DefaultInterfaceTest2();
        defaultMethod.run();

    }

    /**
     * 解决方法
     * 通过重写冲突方法，并指明方法绑定的方式，指定以哪个接口中的默认方法为准。
     */
    @Override
    public void run() {
        InterfaceDemo3.super.run();
    }
}
