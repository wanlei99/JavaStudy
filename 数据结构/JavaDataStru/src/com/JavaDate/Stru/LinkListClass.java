package com.JavaDate.Stru;

public class LinkListClass<E>    //单链表泛型类
{
   public LinkNode<E> head;        //存放头结点

    public LinkListClass()    //构造方法
    {
        head = new LinkNode<E>();    //创建头结点
        head.next = null;        //头结点next成员置为next
    }
    //创建单链表
    public void CreateList(E[] values)
    {
        LinkNode<E> rear=this.head;
        for(int i=0;i< values.length;i++){
            if(values[i]!=null){
                rear.next=new LinkNode<E>(values[i] ,null);
                rear=rear.next;
            }
        }

    }

}
class LinkNode<E>		//单链表结点泛型类
{
    E data;
    LinkNode<E> next;

    public LinkNode()        //构造方法
    {
        next = null;
    }

    public LinkNode(E d)        //重载构造方法
    {
        data = d;
        next = null;
    }

    public LinkNode(E value, Object o) {
    }
}



