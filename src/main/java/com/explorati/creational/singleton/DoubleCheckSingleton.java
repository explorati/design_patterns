package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 21:39 2019/12/20 0020
 * @ Description ：双重检查单例
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
        if(instance != null) {
            throw new IllegalArgumentException("单例模式禁止反射调用");
        }
        System.out.println("DoubleCheckSingleton constructor.");
    }

    public static DoubleCheckSingleton getInstance() {
        if(instance == null) {
            synchronized(DoubleCheckSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
