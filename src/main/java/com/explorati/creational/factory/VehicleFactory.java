package com.explorati.creational.factory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 16:05 2019/12/29 0029
 * @ Description ：工厂类
 */
public abstract class VehicleFactory {

    protected abstract Vehicle createVehicle(String item);

    public Vehicle orderVehicle(String size, String color) {
        Vehicle vehicle = createVehicle(size);
        vehicle.setColor(color);
        vehicle.testVehicle();
        return vehicle;
    }
}
