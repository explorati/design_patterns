package com.explorati.creational.simpleFactory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 14:18 2019/12/21 0021
 * @ Description ：
 */
public class Drink implements IProduct{

    private String name;

    private double price;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
