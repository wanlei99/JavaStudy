package com.company.classJava.week5;

/**
 * @ClassName BookNameException
 * @Description TODO
 * @Author WL
 * @Date 2020/11/2
 **/
public class BookNameException extends Exception {
    private String msg;
    public BookNameException() {
        super();
    }
    public BookNameException(String msg) {
        super();
        this.msg = msg;
    }
    public String showMsg() {
        return this.msg;
    }

}
