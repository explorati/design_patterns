package com.explorati.creational.singleton;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 22:36 2019/12/20 0020
 * @ Description ：容器单例
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap();

    private ContainerSingleton(){}

    public static void putInstance(String key, Object instance) {
        if(StringUtils.isEmpty(key) && instance == null) {
            if(!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
