package com.company.classJava.week3.circle;

import java.text.DecimalFormat;

/**
 * @ClassName CircleApp
 * @Description 求出坐标轴上两点的距离，以及判断某一点和圆的位置关系
 * @Author WL
 * @Date 2020/10/19
 **/
public class CircleApp {
    public static void main(String[] args) {
        //new 一个Circle对象
        Circle circle = new Circle();
        //调用circle的CircleArea方法
        circle.CircleArea(10,10,4);
        //new 一个point对象
        Point point = new Point();
        Point point1 = new Point(10,10);
        Point point2 = new Point(12,13);
        //保留两位小数
        java.text.DecimalFormat df = new DecimalFormat("#.00");
        String distance = df.format( point.pointDistance(point1,point2));
        //输出结果，调用point类中的pointDistance方法
        System.out.println("两点之间的距离为：" + distance + "\n");
        System.out.print("该点的位置：" );
        //调用circle类中的whetherInCircle方法
        circle.whetherInCircle(point1,point2,10);

    }
}
