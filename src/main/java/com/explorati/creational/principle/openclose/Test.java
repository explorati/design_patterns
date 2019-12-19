package com.explorati.creational.principle.openclose;

import java.math.BigDecimal;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 15:17 2019/12/19 0019
 * @ Description ：
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "Java设计模式及最佳实践", new BigDecimal(348.00));
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID：" + javaCourse.getId() + "，课程名称：" + javaCourse.getName() + "， 课程原价：" + javaCourse.getOriginPrice() + "， 折扣价格：" + javaCourse.getPrice());
    }
}
