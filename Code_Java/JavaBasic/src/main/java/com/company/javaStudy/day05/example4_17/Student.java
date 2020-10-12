package com.company.javaStudy.day05.example4_17;

/**
 * @ClassName Student
 * @Description TODO
 * @Author WL
 * @Date 2020/10/11
 **/
public class Student {
    private int age;
    public void setAge (int age) {
        if (age >= 7 &&age <= 28) {
            this.age = age;
        }
    }
    public int getAge () {
        return age;
    }
}
