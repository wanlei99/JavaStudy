package com.company.classJava.week5;

/**
 * @ClassName PriceException
 * @Description TODO
 * @Author WL
 * @Date 2020/11/2
 **/
public class PriceException extends Exception{
    private String msg;
    public PriceException() {
        super();
    }
    public PriceException(String msg) {
        super();
        this.msg = msg;
    }
    public String showMsg() {
        return this.msg;
    }

}
