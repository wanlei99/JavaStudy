package com.company.work1;

public class DeleteClass {
    public static void main(String[] args) throws Exception {
        //初始化linklist对象
        LinkList list=new LinkList();
        //向单链表中添加数据
        for(int i=0;i<10;i++) {
            int temp = ((int) (Math.random() * 100)) % 100;
            //调用linklist中的insert方法
            list.insert(i, temp);
            System.out.println(temp + " ");
        }
        //将第一个元素数据赋值给max
        int max=(int)list.get(0);
       int count=0;
        for(int i=0;i< list.size;i++){
            //寻找最大值并且删除
            if ((int)list.get(i)>=max)
            {
              max=(int)list.get(i);
              count=i;
            }
        }
        //删除最大值，调用linklist中的delete方法
        list.delete(count);
        System.out.println("----"+max);
        //输出删除后的链表
      for (int l=0;l<list.size;l++)
        {
            System.out.println(list.get(l)+" ");
        }

    }
}
