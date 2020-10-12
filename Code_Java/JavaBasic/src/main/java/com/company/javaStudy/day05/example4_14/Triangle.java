package com.company.javaStudy.day05.example4_14;

/**
 * @ClassName Triangle
 * @Description 计算三角形面积
 * @Author WL
 * @Date 2020/10/11
 **/
public class Triangle {
    double sideA,sideB,sideC;
    boolean isTrainge;
    public Triangle(double a,double b,double c){
        sideA = a;
        sideB = b;
        sideC = c;
        if (a + b>c&&c + b>a ){
            isTrainge = true;
        }
        else {
            isTrainge = false;
        }
    }
    public void 计算面积(){
        if (isTrainge) {
            double p = (sideA + sideB + sideC)/2.0;
            double area = Math.sqrt(p * (p - sideA)*(p - sideC));
            System.out.println("是一个三角形，面积是"+ area);

        }
        else {
            System.out.println("不是一个三角形，不能计算面积");
        }
    }
    public void 修改三边 (double a,double b, double c){
        sideC = c;
        sideB = b;
        sideA = a;
        if (a + b > c&&a + c > b&&b + c > a){
            isTrainge = true;
        }
        else
        {
            isTrainge = false;
        }
    }
}
