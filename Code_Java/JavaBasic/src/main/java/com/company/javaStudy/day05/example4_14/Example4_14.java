package com.company.javaStudy.day05.example4_14;

/**
 * @ClassName Example4_14
 * @Description 求三角形面积主函数
 * @Author WL
 * @Date 2020/10/11
 **/
public class Example4_14 {
    public static void main(String[] args) {
        Triangle tri= new Triangle(12,-3,100);
        tri.计算面积();
        tri.修改三边(3,4,5);
        tri.计算面积();
    }
}
