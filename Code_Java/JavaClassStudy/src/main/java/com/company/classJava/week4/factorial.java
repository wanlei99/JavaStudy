package com.company.classJava.week4;

/**
 * @ClassName factorial
 * @Description TODO
 * @Author WL
 * @Date 2020/10/5
 **/
public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        for (int i = 1;i<= n;i++){
            result *= i;
        }
        System.out.println(n + "的阶乘是：" + result);
    }
}
