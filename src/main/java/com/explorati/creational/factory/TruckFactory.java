package com.explorati.creational.factory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 16:19 2019/12/29 0029
 * @ Description ：
 */
public class TruckFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle(String size) {
        if(size.equals("small")) {
            return new SmallTruck();
        } else if(size.equals("large")) {
            return new LargeTruck();
        }
        return null;
    }
}
