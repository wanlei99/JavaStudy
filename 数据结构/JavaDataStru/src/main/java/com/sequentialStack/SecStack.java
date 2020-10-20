package com.sequentialStack;

import com.company.sequentiallist.SeqList;

/**
 * @ClassName SecStack
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public final class SecStack<T> implements Stack<Object> {
    private SeqList list;
    public SecStack(int length) {
        this.list = new SeqList(length);
    }
    public SecStack() {
        this(64);
    }
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(Object x) {
        try {
            this.list.insert(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object peek() {
        return this.list.get(list.size()-1);
    }

    @Override
    public Object pop()  {
        try {
            return list.remove(list.size()-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
