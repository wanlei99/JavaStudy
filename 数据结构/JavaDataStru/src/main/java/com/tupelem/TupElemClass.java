package com.tupelem;

import java.util.ArrayList;

/**
 * @ClassName TupElemClass
 * @Description TODO
 * @Author WL
 * @Date 2020/10/27
 **/
public class TupElemClass {
    /**
     行数
     */
    int rows;
    /**
     * 列数
     */
    int cols;
    /**
     * 非零元素个数
     */
    int nums;
    /**
     * 稀疏矩阵对应的三元数组
     */
    ArrayList<TupElem> data;
    public TupElemClass(int i, int j, int i1) {
        data = new ArrayList<TupElem>();
        nums = 0;
    }
    public void Create(int[][] A, int m, int n ) {
        //由二维数组A创建三元组表示data
        rows = m;
        cols = n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != 0) {
                    data.add(new TupElem(i,j,A[i][j]));
                    nums++;
                }
            }
        }
    }
    public Boolean SetValue (int i, int j, int x) {
        int k = 0;
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return false;
        }
        while (k < nums && i > data.get(k).r) {
            k++;
        }
        while (k < nums && i == data.get(k).r && j > data.get(k).c) {
            k++;
        }
        if (data.get(k).r == i && data.get(k).c == j) {
            data.set(k, new TupElem(i, j, x));
        }
        else {
            data.add(k,new TupElem(i, j, x));
            nums++;
        }
        return true;
    }
    public int GetValue (int i, int j) {
        int k = 0;
        if (i < 0 || i >= rows || j < 0|| j>= cols) {
            return 0;
        }
        while (k < nums && data.get(k).r < i) {
            k++;
        }
        if (data.get(k).r == i && data.get(k).c == j) {
            return  data.get(k).d;
        }
        return 0;
    }
    public void DispTup() {
        if (nums <= 0) {
            return;
        }
        System.out.printf("行数=%d,列数=%d,非零元素个数=%d\n",rows,cols,nums);
        for (int i = 0; i< nums; i++) {
            System.out.printf("%5d%5d%5d\n",data.get(i).r,data.get(i).c,data.get(i).d);
        }
    }
}
