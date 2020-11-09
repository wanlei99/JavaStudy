package com.company.classJava.week5;

/**
 * @ClassName IsNotThirteenNumberException
 * @Description TODO
 * @Author WL
 * @Date 2020/11/2
 **/
public class IsNotThirteenNumberException extends Exception {
    private String msg;
    public IsNotThirteenNumberException() {
        super();
    }
    public IsNotThirteenNumberException(String msg) {
        super();
        this.msg = msg;
    }
    public String showMsg() {
        return this.msg;
    }
}
