package com.JavaDate.Stru;

import java.util.ArrayList;

public class CountMax {
    public static void main(String[] args) {
        LinkNode<Integer> node =new LinkNode<Integer>();
        LinkListClass<Integer> link=new LinkListClass<Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Integer[] list={1,2,3,4,4};
        link.CreateList(list);
        System.out.println(GetMax(link));
    }


    //基本运算算法
    public static int GetMax(LinkListClass<Integer> L) {
        int coun = 0;
        Integer maxe;
        LinkNode<Integer> p = L.head.next;
        maxe = p.data;
        while (p.next != null) {
            if (p.next.data > maxe) {
                coun = 1;
                maxe = p.next.data;
            } else if (p.next.data == maxe) {
                coun++;
                p=p.next;

            }
        }
        return coun;
    }
}



