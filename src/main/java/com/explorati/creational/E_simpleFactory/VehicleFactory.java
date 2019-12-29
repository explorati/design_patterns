package com.explorati.creational.E_simpleFactory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:32 2019/12/29 0029
 * @ Description ：静态工厂模式
 */
public class VehicleFactory {

    public enum VehicleType {
        BIKE, CAR, TRUCK;
    }

    public static Vehicle create(VehicleType type) {
        if(type.equals(VehicleType.BIKE)) {
            return new Bike();
        } else if (type.equals(VehicleType.CAR)) {
            return new Car();
        } else if(type.equals(VehicleType.TRUCK)) {
            return new Truck();
        }

        return null;
    }
}
