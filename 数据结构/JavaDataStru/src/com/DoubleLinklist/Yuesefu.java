package com.DoubleLinklist;

import java.io.FileNotFoundException;
import java.security.PublicKey;

/**
 * @ClassName Yuesefu
 * @Description TODO
 * @Author WL
 * @Date 2020/10/7
 **/
public class Yuesefu {
    public static void main(String[] args) throws FileNotFoundException
 {
        System.out.println("**************测试***************");
        int n=6,m=3;
        Joseph L = new Joseph(n,m);
        System.out.println("n="+n+",m="+m+"约瑟夫序列");
        System.out.println(L.Jsequence());

        System.out.println("***************测试二***************");
        n=8;m=4;
        L=new Joseph(n,m);
        System.out.println("n="+n+",m="+m+"约瑟夫序列");
        System.out.println(L.Jsequence());
    }
    static class Child
    {
        int no;
        Child next;
        public  Child(int no1)
        {
            no = no1;
            next = null;
        }
    }

}
class Joseph
{
    int n,m;
    Yuesefu.Child first;

    public  Joseph(int n1, int m1)
    {
        Yuesefu.Child p,t;
        n=n1;m=m1;
        first = new Yuesefu.Child(1);
        t= first;
        for (int i=2;i<=n;i++)
        {
            p=new Yuesefu.Child(i);
            t.next=p; t=p;
        }
        t.next=first;
    }
    public String Jsequence()
    {
        String ans="";
        int i,j;
        Yuesefu.Child p,q;
        for (i=1;i<=n;i++)
        {
            p=first;
            j=1;
            while (j<m-1)
            {
                j++;
                p=p.next;
            }
            q=p.next;
            ans+=q.no+"";
            p.next=q.next;
            first=p.next;
        }
        return ans;
    }

}

