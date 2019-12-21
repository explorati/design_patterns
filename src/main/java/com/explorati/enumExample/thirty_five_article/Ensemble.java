package com.explorati.enumExample.thirty_five_article;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 20:39 2019/12/21 0021
 * @ Description ：永远不要根据枚举的序数导出与他关联的值，而是要将他保存在一个实例域中
 */
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTER(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
    NONET(9), DECTET(10), TRIPLE_QUARTET(12);

    private final int numberOfMusicians;

    Ensemble(int size) {
        this.numberOfMusicians = size;
    }

    public int numberOfMusicians() {
        return numberOfMusicians;
    }
}
