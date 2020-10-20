package com.sequentialStack;

/**
 * @ClassName Stack
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public interface Stack<T> {
    /**
     * 判断栈是否为空
     * @return
     */
    public abstract boolean isEmpty();

    /**
     * 元素入栈
     * @param x
     */
    public abstract void push (T x);

    /**
     * 返回栈顶元素，未出栈
     * @return
     */
    public abstract T peek();

    /**
     * 出栈，返回栈顶元素
     * @return
     */
    public  abstract T pop() throws Exception;
}
