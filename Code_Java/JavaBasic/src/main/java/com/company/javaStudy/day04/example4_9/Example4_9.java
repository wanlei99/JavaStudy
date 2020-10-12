package com.company.javaStudy.day04.example4_9;

/**
 * @ClassName Example4_9
 * @Description 第四章4.9
 * @Author WL
 * @Date 2020/10/6
 **/
public class Example4_9 {
    public static void main(String[] args) {
        int result = A.getContinueSum(0,100);
        System.out.println(result);
    }
    }
    class A {
        int x,y,z;
        static int getContinueSum(int start,int end){
            int sum = 0;
            for (int i = start;i <= end;i++){
                sum = sum + i;
            }
            return sum;
    }
}
