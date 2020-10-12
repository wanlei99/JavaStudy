package com.company.javaStudy.day01.example01;

/*
 * author wanlei
 * date 2020/09/28
 * 类的调用
 *
 * */
public class Example_1 {
    public static void main(String[] args) {
        Rect rectangle;
        rectangle = new Rect();
        rectangle.height = 1.5;
        rectangle.width = 1.819;
        double area = rectangle.getArea();
        System.out.println("矩形的面积："+ area);

    }
}

