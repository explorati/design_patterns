package com.explorati.creational.simpleFactory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 14:23 2019/12/21 0021
 * @ Description ：
 */
public class Test {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
//        IProduct product = factory.getProduct("food");
        IProduct product = factory.getProduct(Food.class);
        System.out.printf("name: %s, price: %f%n", product.getName(), product.getPrice());
    }
}
