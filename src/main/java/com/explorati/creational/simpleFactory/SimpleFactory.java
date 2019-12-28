package com.explorati.creational.simpleFactory;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 14:19 2019/12/21 0021
 * @ Description ：简单工厂的两种实现
 */
public class SimpleFactory {

    //根据传入的类型一个一个判断，不符合开闭原则
//    public IProduct getProduct(String type) {
//        if(type.equalsIgnoreCase("food")) {
//            return new Food();
//        } else if(type.equalsIgnoreCase("Drink")) {
//            return new Drink();
//        }
//        return null;
//    }

    //根据传入的类利用反射来实现动态判断
    public IProduct getProduct(Class c) {
        IProduct product = null;
        try {
            product = (IProduct) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    return product;
    }
}
