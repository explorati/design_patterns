package com.explorati.creational.E_simpleFactory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:43 2019/12/29 0029
 * @ Description ：
 */
public class Car extends Vehicle{
    @Override
    protected void description() {
        System.out.println("小汽车");
    }
}
