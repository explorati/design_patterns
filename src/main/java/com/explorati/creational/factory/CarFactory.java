package com.explorati.creational.factory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 16:09 2019/12/29 0029
 * @ Description ：
 */
public class CarFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle(String size) {
        if(size.equals("small"))
            return new SportCar();
        else if(size.equals("large")) {
            return new SedanCar();
        }
        return null;
    }
}
