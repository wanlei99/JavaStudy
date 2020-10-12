package com.company.javaStudy.day04.example4_11;

/**
 * @ClassName Student
 * @Description 第四章4.9
 * @Author WL
 * @Date 2020/10/6
 **/
public class Student {
    int number;
    Student (int n) {
        number = n;
    }
    void  speak(){
        System.out.println("Student类的包名是com.company.JavaStudy.day04.Example4_11，我的学号："+number);
    }
}
