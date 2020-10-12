package com.company.javaStudy.day05.example4_16;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author WL
 * @Date 2020/10/11
 **/
public class AAA {
    private int money;
    private int getMoney(){
        return money;
    }

    public static void main(String[] args) {
        AAA a = new AAA();
        a.money = 3000;
        int m = a.getMoney();
        System.out.println("money:" + m);
    }
}
