package com.company.javaStudy.day06.example4_18;

/**
 * @ClassName Example4_18
 * @Description TODO
 * @Author WL
 * @Date 2020/10/13
 **/
public class Example4_18 {
    public static void main(String[] args) {
        char a[] = {'a','b','c','D','E','F'};
        for (int i = 0; i < a.length; i++)
        {
            if (Character.isLowerCase(a[i]))
            {
                a[i] = Character.toUpperCase(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("" + a[i]);
        }
    }
}
