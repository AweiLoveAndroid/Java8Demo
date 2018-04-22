package com.lzw.java8demo.optional;

import java.util.Optional;

/**
 * 使用Optional
 */
public class OptionalDemo {

    //这样做很可能User对象为空，导致空指针
//    private String getUserName(User user) {
//        return user.getUserName();
//    }

    //做非空判断，这是十分繁琐的一段代码，假如属性很多，那就要写很多if else语句
//    private String getUserName(User user) {
//        if (user != null) {
//            return user.getUserName();
//        }
//        return null;
//    }

    /**
     * 使用java8的 Optional 就可以解决问题
     * @param user User对象
     * @return
     */
    private String getUserName(User user) {
        Optional<User> userOptional = Optional.ofNullable(user);

        /**
         * 常用api
         */

//        判断其他对象是否等于 Optional
//        userOptional.equals(obj);


//        如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，
//        否则返回一个空的Optional；
//        Predicate<User> predicate =new Predicate<User>() {
//            @Override
//            public boolean test(User user) {
//                return false;
//            }
//        };
//        userOptional.filter(predicate);


//        如果值存在，返回基于Optional包含的映射方法的值，否则返回一个空的Optional；
//        userOptional.flatMap();


//        如果在这个Optional中包含这个值，返回值，否则抛出异常：NoSuchElementException；
//        userOptional.get();

//        返回存在值的哈希码，如果值不存在 返回 0；
//        userOptional.hashCode();


//        如果值存在则使用该值调用 consumer , 否则不做任何事情；
//        userOptional.ifPresent();


//        如果值存在则方法会返回true，否则返回 false；
//        userOptional.isPresent();

//        如果存在该值，提供的映射方法，如果返回非null，返回一个Optional描述结果；
//        userOptional.map();


//        如果存在该值，返回值， 否则返回 other；
//        userOptional.orElse();


//        如果存在该值，返回值， 否则触发 other，并返回 other 调用的结果；
//        userOptional.orElseGet();


//        如果存在该值，返回包含的值，否则抛出由 Supplier 继承的异常；
//        userOptional.orElseThrow();


//        返回一个Optional的非空字符串，用来调试
//        userOptional.toString();

        return userOptional.map(User::getUserName).orElse(null);
    }

}
