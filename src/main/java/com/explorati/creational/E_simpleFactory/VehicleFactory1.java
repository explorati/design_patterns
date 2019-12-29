package com.explorati.creational.E_simpleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 15:51 2019/12/29 0029
 * @ Description ：使用反射机制进行类注册的简单工厂模式
 */
public class VehicleFactory1 {

    private static Map<String, Class> registeredProducts = new HashMap<String, Class>();

    public void registerVehicle(String vehicleId, Class vehicleClass) {
        registeredProducts.put(vehicleId, vehicleClass);
    }

    public static Vehicle createVehicle(String type) throws IllegalAccessException, InstantiationException {
        Class productClass = registeredProducts.get(type);
        return (Vehicle) productClass.newInstance();
    }
}
