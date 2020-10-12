package com.company.javaStudy.day05.example4_17;

/**
 * @ClassName Example4_17
 * @Description 类的调用
 * @Author WL
 * @Date 2020/10/11
 **/
public class Example4_17 {
    public static void main(String[] args) {
        Student zhang = new Student();
        Student geng = new Student();
        zhang.setAge(23);
        System.out.println("zhang的年龄：" + zhang.getAge());
        geng.setAge(25);
        System.out.println("geng的年龄： "+ geng.getAge());
    }
}
