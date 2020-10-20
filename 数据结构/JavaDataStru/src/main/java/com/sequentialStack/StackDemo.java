package com.sequentialStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @ClassName StackDemo
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public class StackDemo {
    static void showPush(Stack<Integer> st,int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);

    }
    static void showPop(Stack <Integer> st){
        System.out.print("pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        System.out.println("stack: "+st);
        showPush(st,1);
        showPush(st,2);
        showPush(st,3);

        showPop(st);
        showPop(st);
        showPop(st);

        try {
            showPop(st);
        }catch (EmptyStackException e) {
            System.out.println("empty stack");
        }

    }

}
