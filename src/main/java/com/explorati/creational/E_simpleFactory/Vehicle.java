package com.explorati.creational.E_simpleFactory;

import java.math.BigDecimal;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:34 2019/12/29 0029
 * @ Description ：
 */
public abstract class Vehicle{

    public String name;

    public BigDecimal speed;

    public Vehicle(String name, BigDecimal speed) {
        name = this.name;
        speed = this.speed;
    }

    public Vehicle() {

    }

    protected abstract void description();

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }
}
