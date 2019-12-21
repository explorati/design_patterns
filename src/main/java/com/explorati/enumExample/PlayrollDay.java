package com.explorati.enumExample;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 13:57 2019/12/21 0021
 * @ Description ：策略枚举
 */
public enum PlayrollDay {

    MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATUSDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PlayrollDay() {
        this(PayType.WEEKDAY);
    }

    PlayrollDay(PayType payType){
        this.payType = payType;
    }

    private enum PayType{
        WEEKDAY {
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int minsWorked, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }
}
