package com.explorati.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 22:20 2019/12/20 0020
 * @ Description ：
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
//        System.out.println(doubleCheckSingleton.getClass());
//        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
//        System.out.println(doubleCheckSingleton1.getClass());

//        EnumSingleton singleton = EnumSingleton.getInstance();
//        singleton.test();

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Class objectClass = Singleton.class;
//        Class.forName(Singleton.class.getName());
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance());

    }
}
