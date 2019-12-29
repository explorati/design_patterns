package com.explorati.creational.factory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 16:14 2019/12/29 0029
 * @ Description ：测试类
 */
public class Test {

    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        factory.orderVehicle("small", "blue");

        VehicleFactory factory1 = new TruckFactory();
        factory1.orderVehicle("large", "red");

        /**
         * 匿名具体工厂模式
         */
        VehicleFactory bikeFactory = new VehicleFactory() {
            @Override
            protected Vehicle createVehicle(String size) {
                if(size.equals("small"))
                    return new MountainBike();
                else if(size.equals("large")) {
                    return new CityBike();
                }
                return null;
            }
        };
        bikeFactory.orderVehicle("large", "purple");

    }
}
