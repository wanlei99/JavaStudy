package com.sequentialStack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName StackDemoApp
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public class StackDemoApp {
    public static void main(String[] args) {
        SecStack secStack = new SecStack();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(31);
        arrayList.add(2);
        arrayList.add(5);

        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        System.out.println(secStack);
        System.out.println("****************");
        secStack.push(arrayList);
        System.out.println(secStack.peek());
        secStack.push(arrayList1);
        System.out.println(secStack.peek());
        System.out.println("****************");
        System.out.println(secStack.pop());
        System.out.println("****************");





    }
}
