package com.explorati.principle.openclose;

import java.math.BigDecimal;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 15:28 2019/12/19 0019
 * @ Description ：
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    public BigDecimal getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal bd = super.getPrice().multiply(new BigDecimal(0.8));
        BigDecimal gb1 = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return gb1;
    }
}
