package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 21:34 2019/12/20 0020
 * @ Description ：单例模式
 */
public class Singleton {

    private static Singleton instance = null;
    private Singleton() {
        /**
         * 防止反射调用
         */
        if(instance != null) {
            throw new IllegalArgumentException("单例模式禁止反射调用");
        }
        System.out.println("Singleton is Instantiated.");
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Something is Done.");
    }

    /**
     * 防止序列化
     * @return
     */
    private Object readResolve() {
        return instance;
    }
}
