package com.explorati.creational.simpleFactory;

import java.math.BigDecimal;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 14:15 2019/12/21 0021
 * @ Description ：
 */
public class Food implements IProduct{

    private String name = "山楂";

    private double price = 2.00;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
