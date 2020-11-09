package com.tupelem;

/**
 * @ClassName TupElemApp
 * @Description TODO
 * @Author WL
 * @Date 2020/10/27
 **/
public class TupElemApp {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,4},{4,5}};
        TupElemClass tupElemClass =new TupElemClass(2, 3, 3);
        System.out.println();
        tupElemClass.Create(arr,2,3);
        tupElemClass.DispTup();
    }
}
