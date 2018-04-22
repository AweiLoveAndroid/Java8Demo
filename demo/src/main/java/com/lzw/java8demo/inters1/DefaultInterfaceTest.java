package com.lzw.java8demo.inters1;

/**
 * java8的新特性的一个demo
 */
public class DefaultInterfaceTest implements InterfaceDemo{

    public static void main(String[] args) {
        /**
         * 可以看出InterfaceDemo接口中有由default定义的默认方法后，
         * 那么其实现类DefaultInterfaceTest也同样能够拥有实例方法run()
         */
        DefaultInterfaceTest defaultMethod = new DefaultInterfaceTest();
        defaultMethod.run();
    }

    /**
     * start()方法是抽象的，必须重写
     */
    @Override
    public void start() {

    }

    /**
     * run()方法是default修饰的，可以选择重写，也可以不重写
     */
    @Override
    public void run() {

    }
}
