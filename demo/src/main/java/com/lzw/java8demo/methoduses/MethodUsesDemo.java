package com.lzw.java8demo.methoduses;

import java.util.ArrayList;

/**
 * 方法引用使用::来定义
 * ::的前半部分表示类名或者实例名，后半部分表示方法名，如果是构造方法就使用 new 来表示
 * 通过类名或者实例名与方法名的组合来直接访问到类或者实例已经存在的方法或者构造方法
 *
 * 【使用】一共有以下几种形式：
 *     静态方法引用：ClassName::methodName;
 *     实例上的实例方法引用：instanceName::methodName;
 *     超类上的实例方法引用：supper::methodName;
 *     类的实例方法引用：ClassName:methodName;
 *     构造方法引用Class:new;
 *     数组构造方法引用::TypeName[]::new
 *
 */
public class MethodUsesDemo {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            // 使用了Car::new 通过构造方法的方法引用的方式进一步简化了lambda的表达式
            Car car = Car.createCar(Car::new);
            cars.add(car);
        }
        // 使用了Car::showCar 表示实例方法引用
        cars.forEach(Car::showCar);

    }

    static class Car {

        public void showCar() {
            System.out.println(this.toString());
        }

        public static Car createCar(Factory<Car> factory) {
            return factory.create();
        }
    }

    @FunctionalInterface
    interface Factory<T> {
        T create();
    }

}
