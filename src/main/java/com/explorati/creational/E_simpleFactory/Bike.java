package com.explorati.creational.E_simpleFactory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:35 2019/12/29 0029
 * @ Description ：
 */
public class Bike extends Vehicle {

    public Bike() {
        super();
    }

    @Override
    public void description() {
        System.out.println("自行车");
    }
}
