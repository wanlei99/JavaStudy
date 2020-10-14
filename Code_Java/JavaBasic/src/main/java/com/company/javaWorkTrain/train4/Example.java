package com.company.javaWorkTrain.train4;

/**
 * @ClassName Example
 * @Description 习题四第五题
 * @Author WL
 * @Date 2020/10/14
 **/
public class Example {

    public static void main(String[] args) {
        AAA a = new AAA();
        a = null;
        System.out.print(AAA.m);
        System.out.print(a);
    }
}
class AAA{
    static int m;
    static {
        m = 888;
    }
}
