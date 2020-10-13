package com.company.javaStudy.day06.example4_19;

/**
 * @ClassName Example4_19
 * @Description 自动装箱与拆箱
 * @Author WL
 * @Date 2020/10/13
 **/
public class Example4_19 {
    public static void main(String[] args) {
        //装箱
        Integer x = 100,y = 12;
        //先拆箱在装箱
        Integer m = x + y;
        //拆箱
        int ok = m;
        System.out.println(ok);
    }
}
