package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 21:44 2019/12/20 0020
 * @ Description ：静态内部类单例
 */
public class StaticInnerSingleton {

    private static class StaticInnerClass {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerClass.instance;
    }
}
