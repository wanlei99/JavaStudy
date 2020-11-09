package com.company.classJava.week5;

import java.lang.reflect.MalformedParametersException;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @ClassName ExceptionTest1
 * @Description 异常练习
 * @Author WL
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
        //ArithmeticException 算数错误
        //int result = 0;
        //try {
        //     result = 3 / 0;
        //} catch (ArithmeticException e) {
        //    //e.printStackTrace();
        //    System.err.println("除数不能为0");
        //}
        //System.out.println(result）;


        //ArrayIndexOutOfBoundsException索引越界
        //int[] a = new int[] {1,2,3,4,5};
        //try {
        //    System.out.println(a[5]);
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.err.println("异常的详细信息：" + e.getMessage());
        //    System.err.println("索引越界");
        //    System.err.println("引起异常的原因：" + e.getCause());
        //    System.err.println("异常对象e:" + e.toString());
        //    }



        System.out.println("请输入价格：");
        //NumberFormatException数字格式化异常
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一串字符串
        String price = scanner.nextLine();
        //将字符串转换为整型
        try {
            int result = Integer.parseInt(price);
            System.out.println("price: " + price);

        } catch (NumberFormatException e) {
            System.err.println("请输入数字！");
            System.err.println("异常的详细信息：" + e.getMessage());
            System.err.println("引起异常的原因：" + e.getCause());
            System.err.println("异常对象e:" + e.toString());
        }

        // NPE NullPointerException 空指针异常





    }
}
