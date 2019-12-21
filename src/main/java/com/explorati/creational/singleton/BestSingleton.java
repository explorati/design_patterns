package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:05 2019/12/21 0021
 * @ Description ：最佳单例实现形式(新版Java中，类只有在使用时才被加载，所以此种方法也属于延迟加载,目前没有一种创建提前加载单例模式的可靠选项)
 */
public class BestSingleton {
    private static final BestSingleton instance = new BestSingleton();

    private BestSingleton(){}

    public static synchronized BestSingleton getInstance() {
        return instance;
    }
}
