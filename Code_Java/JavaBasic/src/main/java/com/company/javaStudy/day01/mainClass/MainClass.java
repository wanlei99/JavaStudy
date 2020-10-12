package com.company.javaStudy.day01.mainClass;

/*
 * author wanlei
 * date 2020/09/28
 * 利用类的调用来求圆的面积
 *
 * */
public class MainClass {

    public static void main(String[] args) {
        Circle circle = new Circle();//创建Circle对象
        circle.printArea(100);//调用printArea方法
        Retangle rect = new Retangle();//创建Retangle对象
        rect.printArea(100,65);//调用printArea方法
    }
}

