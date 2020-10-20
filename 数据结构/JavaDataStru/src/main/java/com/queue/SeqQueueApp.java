package com.queue;

import java.util.ArrayList;

/**
 * @ClassName SeqQueueApp
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public class SeqQueueApp {
    public static void main(String[] args) {
        SeqQueue seqQueue = new SeqQueue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        seqQueue.add(arrayList);
        System.out.println("返回队头元素"+seqQueue.peek());
        System.out.println("出队"+seqQueue.poll());

    }
}
