package com.graph;

/**
 * @ClassName MatGraphClassTest
 * @Description TODO
 * @Author WL
 * @Date 2020/11/17
 **/
public class MatGraphClassTest {
    public static void main(String[] args) {
        MatGraphClass matGraphClass = new MatGraphClass();
        int[][] a = {{1,2},{3,4},{4,5}};
        matGraphClass.CreateMatGraph(a, 2 ,6);
        matGraphClass.dispMatGraph();
        int i = MatGraphClass.Degree1(matGraphClass, 1);
        System.out.println("输出顶点为1的度：" + i);
        int[] ints = MatGraphClass.Degree2(matGraphClass, 1);
        System.out.println("输出顶点为1的度：" + ints);

    }
}
