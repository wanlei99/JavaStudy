package com.queue;

/**
 * @ClassName SeqQueue
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public final class SeqQueue<T> implements Queue<T> {
    /**
     * 存储队列数据元素的数组
     */
    private Object element[];
    /**
     * front rear 分别为队列的头尾下表
     */
    private int front, rear;
    /**
     * 常量指定element数组容量的最小值
     */
    private static final int MIN_CAPACITY=16;

    /**
     * 构造空队列，length指定数组容量
     * @param length
     */
    public SeqQueue(int length) {
        //设置队列数组容量最小值
        if (length < MIN_CAPACITY)
        {
            length = MIN_CAPACITY;
        }
        this.element = new Object[length];
        //设置空队列
        this.front = this.rear = 0;
    }

    /**
     * 构造空队列，默认容量
     */
    public SeqQueue() {
        //默认队列数组容量取最小值
        this(MIN_CAPACITY);
    }

    /**
     * 判断队列是否空，若空返回true
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.front==this.rear;
    }

    /**
     * 元素x入队，空对象不能入队
     * @param x
     * @return
     */

    @Override
    public boolean add(T x) {
        if (x==null)
        {
            return false;
        }
        //入队列满则空充数组
        if (this.front==(this.rear+1)%this.element.length)
        {
            Object[] temp = this.element;
            //重新申请一个容量更大的数组
            this.element = new Object[temp.length*2];
            int j = 0;
            for (int i=this.front; i!=this.rear; i=(i+1)%temp.length)
            {
                //按照队列元素顺序复制数组元素
                this.element[j++] = temp[i];
            }
            this.front = 0;
            this.rear = j;
        }
        this.element[this.rear] = x;
        this.rear = (this.rear+1) %this.element.length;
        return true;
    }

    /**
     * 返回队头元素，没有删除。若队列为空，则返回null
     * @return
     */

    @Override
    public T peek() {
        return this.isEmpty() ? null : (T)this.element[this.front];
    }

    /**
     * 出队，返回队头元素。若队列空则返回null
     * @return
     */

    @Override
    public T poll() {
        if (this.isEmpty())
        {
            return  null;
        }
        T temp = (T)this.element[this.front];
        this.front = (this.front+1)%this.element.length;
        return temp;
    }
}
