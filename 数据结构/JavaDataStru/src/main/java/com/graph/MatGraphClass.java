package com.graph;

import sun.awt.OverrideNativeWindowHandle;

/**
 * @ClassName MatGraphClass
 * @Description TODO
 * @Author WL
 * @Date 2020/11/17
 **/
public class MatGraphClass {
    final int MAXV = 100;
    final int INF = 0x3f3f3f3f;
    int[][] edges;
    int n,e;
    String[] vexs;
    public MatGraphClass() {
        edges = new int[MAXV][MAXV];
        vexs = new String[MAXV];
    }
    //图的基本运算
    public void CreateMatGraph(int[][] a,int n,int e)
    {
        //置顶点数和边数
        this.n=n; this.e=e;
        for (int i=0;i<n;i++)
        {  edges[i]=new int[n];
            for (int j=0;j<n;j++) {
                edges[i][j] = a[i][j];
            }
        }
    }
    public void dispMatGraph()		//输出图
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (edges[i][j] == INF) {
                    System.out.printf("%4s", "∞");
                } else {
                    System.out.printf("%5d", edges[i][j]);
                }
                System.out.println();
            }
        }
    }
    public static int Degree1(MatGraphClass g,int v)
//无向图邻接矩阵中求顶点v的度
    {  int d=0;
        //统计第v行的非0非∞元素个数
        for (int j=0;j<g.n;j++) {
            if (g.edges[v][j] != 0 && g.edges[v][j] != g.INF) {
                d++;
            }
        }
        return d;
    }
    public static int[] Degree2(MatGraphClass g,int v)
//有向图邻接矩阵中求顶点v的出度和入度
    {
        int[] ans=new int[2];
        //累计出度
        ans[0]=0;
        //统计第v行的非0非∞元素个数为出度
        for (int j=0;j<g.n;j++) {
            if (g.edges[v][j] != 0 && g.edges[v][j] != g.INF) {
                ans[0]++;
            }
        }
        //累计入度
        ans[1]=0;

        for (int i=0;i<g.n;i++) {
            if (g.edges[i][v] != 0 && g.edges[i][v] != g.INF) {
                ans[1]++;

            }
        }
        //返回出度和入度
        return ans;
    }
}
