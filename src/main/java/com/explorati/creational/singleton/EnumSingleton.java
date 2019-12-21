package com.explorati.creational.singleton;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 21:57 2019/12/20 0020
 * @ Description ：枚举单例(Effective Java中推荐)
 */
public enum EnumSingleton {

//    INSTANCE(1, "枚举单例"),
    INSTANCE1{
        protected void test() {
            System.out.println("枚举单例对象");
        }
    };

    private Integer code;
    private String message;

    protected abstract void test();

    EnumSingleton(){}

    EnumSingleton(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String valueOf(int index) {
        for(EnumSingleton singleton : values()) {
            if(singleton.code == index) {
                return singleton.message;
            }
        }
        return null;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE1;
    }
}
