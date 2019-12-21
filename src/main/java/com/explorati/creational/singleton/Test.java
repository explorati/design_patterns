package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 22:20 2019/12/20 0020
 * @ Description ：
 */
public class Test {

    public static void main(String[] args) {
//        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
//        System.out.println(doubleCheckSingleton.getClass());
//        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
//        System.out.println(doubleCheckSingleton1.getClass());

        EnumSingleton singleton = EnumSingleton.getInstance();
        singleton.test();

    }
}
