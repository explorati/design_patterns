package com.explorati.enumExample;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:51 2019/12/21 0021
 * @ Description ：
 */
public class WeightTable {

    public static void main(String[] args) {

        double earthWeight = 185.00;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for(Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
        }
    }
}
