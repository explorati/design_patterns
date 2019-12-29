package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 21:39 2019/12/20 0020
 * @ Description ：双重检查单例
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
        /**
         * 防止反射调用：但是懒汉式加载创建实例时看时机；假如反射先调用，则创建两个不同对象，无法避免
         */
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
