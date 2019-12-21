package com.explorati.enumExample;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:39 2019/12/21 0021
 * @ Description ：枚举类示例
 */
public enum Planet {

    //每个枚举常量后面的值就是传递给构造器的参数
    MERCURY(3.302e+23,2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6),
    MARS(6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN(5.685e+26, 6.027e7),
    URANUS(8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);

    //域
    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67300E-11;

    //两个需要传入的，一个默认的
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {
        return mass;
    }
    public double radius() {
        return radius;
    }
    public double surfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }
}
