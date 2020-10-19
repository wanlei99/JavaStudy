package com.company.classJava.week3.circle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

/**
 * @ClassName Point
 * @Description 点类
 * @Author WL
 * @Date 2020/10/19
 **/
public class Point {
    private Integer x;
    private Integer y;

    /**
     *
     * 构造无参构造函数
     */
    public Point(){
    }

    /**
     * 构造有参构造函数
     * @param x 横坐标
     * @param y 纵坐标
     */
    public  Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     *求两点之间的距离
     * @param a point临时变量
     * @param b point临时变量
     * @return 两点之间的距离
     */
    public double pointDistance (Point a, Point b){


        return (Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y)*(b.y - a.y)));
    }

}
