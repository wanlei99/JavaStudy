/**
 * @ClassName Linked
 * @Description TODO
 * @Author WL
 * @Date 2020/10/15
 **/
public class Linked<T> {
    /**
     *  链表存储的节点
     */
    private class Node{
        private T t;
        private  Node next;
        public Node(T t,Node next)
        {
            this.t = t;
            this.next = next;
        }
        public Node(T t)
        {
            this(t,null);
        }
    }

    /**
     * 头结点
     */
    private Node head;
    /**
     * 链表的元素个数
     */
    private int size;
    /**
     * 无参构造函数
     */
    public Linked(){
        this.head = null;
        this.size = 0;
    }
    /**
     * 链表头部添加元素
     */
    public void addFirst(T t){
        Node node = new Node(t);
        node.next = this.head;
        this.head = node;
        this.size++;
        //和上述代码效果相同
        //this.head = new Node(e,head);
    }
    /**
     * 向链表尾部插入元素
     */
    public void addLast(T t){
        this.add(t,this.size);
    }
    /**
     * 向链表中间插入元素
     */
    public void add(T t,int index){
        if (index < 0 || index > size)
        {
            throw new IllegalArgumentException("index is error");
        }
        if (index == 0)
        {
            this.addFirst(t);
        }
        Node preNode = this.head;
        //找到要插入节点的前一个节点
        for (int i = 0; i < index - 1; i++)
        {
            preNode = preNode.next;
        }
        Node node = new Node(t);
        //要插入的节点的下一个节点指向preNode节点的下一个节点
        node.next = preNode.next;
        //preNode的下一个节点指向要插入节点node
        preNode.next = node;
        //链表的长度加一
        this.size++;
    }

    /**
     * 根据值查询链表中是否包含该元素
     * 实现思想：定义一个变量cur，将头元素赋值给变量cur，若链表不为空，则比较
     * 该值和cur比较，若相等则返回true；若是不相等则和该元素的下一个元素比较，直到找到
     * 相等的元素。若没有则返回false
     */

    public boolean contains(T t){
        Node cur = this.head;
        //判断是否包含该元素
        while (cur != null)
        {
            if(cur.t.equals(t))
            {
                return true;
            }
            else
            {
                cur = cur.next;
            }
        }
        return false;
    }

}
