package com.company.sequentiallist;

/**
 * @ClassName SeqList
 * @Description 顺序表的初始化
 * @Author WL
 * @Date 2020/10/20
 **/
public class SeqList<T> implements List {
    /**
     * 顺序表元素个数（长度）
     */
   protected int n;
    /**
     * 对象数组存储顺序表的数据元素，保护成员
     */
   protected Object[] element;
    /**
     * 常量，指定element数组容量的最小值
     */
   private static final int MIN_CAPACITY = 16;

    public SeqList() {
        this(MIN_CAPACITY);
    }

    public SeqList(int length) {
        if (length < MIN_CAPACITY) {
            length = MIN_CAPACITY;
        }
        this.element = new Object[length];
        this.n = 0;
    }
    public SeqList(T[] values) {
        this(values.length * 2);
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                this.element[this.n++] = values[i];
            }
        }
    }
    @Override
    public boolean isEmpty() {
        return this.n == 0;
    }

    @Override
    public int size() {

        return this.n;
    }

    @Override
    public T get(int i) {
        if (i >= 0 && i < this.n) {
            return (T)this.element[i];
        }
        return null;
    }

    @Override
    public Object set(int i, Object x) throws Exception {
        if (x == null) {
            throw new NullPointerException("x==null");
        }
        if (i >= 0 && i < this.n) {
            this.element[i] = x;
        }
        else {
            throw new java.lang.IndexOutOfBoundsException(i + "");
        }
        return null;
    }

    @Override
    public int search(Object key) {
        for (int i = 0; i<this.n;i++) {
            if (key.equals(this.element[i])) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int insert(int index, Object obj) throws Exception {
        //如果当前线性表已满，那就不允许插入数据
        if (obj == null) {
            throw new Exception("顺序表已满，无法插入！");
        }

        if (index < 0) {
            index = 0;
        }
        if (index > this.n)
        {
            index = this.n;
        }
        Object[] source = this.element;
        if (this.n == element.length) {
            this.element = new Object[source.length];
            for (int j = 0; j < index; j--) {
                this.element[j] = source[j];
            }
            for (int j = this.n - 1; j >= index; j--) {
                this.element[j + 1] = source[j];
            }
        }
        this.element[index] = obj;
        this.n++;
        return index;

    }
    public int insert(T x) throws Exception {
        return this.insert(this.n,x);
    }

    @Override
    public T remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("顺序表为空，无法删除！");
        }
        if (index >=0 && index < this.n) {
            T x = (T)this.element[index];
            for (int i = index; i < this.n - 1; i++ ) {
                this.element[i] = this.element[i+1];
            }
            this.element[this.n-1] = null;
            this.n--;
            return x;
        }
        return null;

    }


}
