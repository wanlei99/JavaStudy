package com.company.javaStudy.day01;
/*
* author wanlei
* date 2020/09/28
* java输出练习
*
* */

public class JavaStudyOneDay {
    public static void main(String[] args) {
        //输出提示
        System.out.println("这是一个简单的Java程序");
        //创建一个Student对象
        Student stu = new Student();
        //调用Student类中的speak方法
        stu.speak("We are student !");
    }
}
/**
创建Student类
 */
class Student {
    /**创建speak方法*/
    public void speak(String s){
        //输出
        System.out.println(s);
    }
}