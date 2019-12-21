package com.explorati.principle.openclose;

import java.math.BigDecimal;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 15:15 2019/12/19 0019
 * @ Description ：
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private BigDecimal price;

    public JavaCourse(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
