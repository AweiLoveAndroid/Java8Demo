package com.lzw.java8demo.lambda;

import java.util.Arrays;

/**
 * lambda表达式是函数式编程的核心
 * lambda表达式即匿名函数，是一段没有函数名的函数体，可以作为参数直接传递给相关的调用者。
 * lambda表达式极大的增加了Java语言的表达能力。
 * 【语法结构】：
 *   (parameters) -> expression 或
 *   (parameters) ->{ statements; }
 *
 */
public class LambdaDemo {

    public static void main(String args[]){

        LambdaDemo lambdaDemo = new LambdaDemo();

        // 类型声明
        MathOperation addition = (int a, int b)-> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a- b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {return a * b;};

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("类型声明：==> 10 + 5 = " + lambdaDemo.operate(10, 5, addition));
        System.out.println("不用类型声明：==> 10 - 5 = " + lambdaDemo.operate(10, 5, subtraction));
        System.out.println("大括号中的返回语句：==> 10 x 5 = " + lambdaDemo.operate(10, 5, multiplication));
        System.out.println("没有大括号及返回语句：==> 10 / 5 = " + lambdaDemo.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message -> System.out.println("不用括号 ==> " + message);

        // 用括号
        GreetingService greetService2 = (message) -> System.out.println("用括号 ==> " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");


        /**
         * lambda还可以访问外部局部变量
         * 在lambda中访问类的成员变量或者局部变量时，会隐式转换成final类型变量
         */
        int adder = 5;
        Arrays.asList(1, 2, 3, 4, 5).forEach(e -> System.out.println(e + adder));

        //上面两行的代码等价于：
        final int adder2 = 5;
        Arrays.asList(1, 2, 3, 4, 5).forEach(e -> System.out.println(e + adder2));
    }


    interface MathOperation {
        int operation(int a, int b);
    }


    interface GreetingService {
        void sayMessage(String message);
    }


    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
