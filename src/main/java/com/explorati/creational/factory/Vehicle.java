package com.explorati.creational.factory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 16:02 2019/12/29 0029
 * @ Description ：
 */
public abstract class Vehicle {
    private String color;

    abstract void description() ;

    public void testVehicle() {
        this.description();
        System.out.println("color：" + color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
