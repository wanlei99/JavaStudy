package com.erchashu;

/**
 * @ClassName BTNode
 * @Description TODO
 * @Author faine
 * @Date 2020/11/3
 **/
public class BTNode<E> extends BTreeClass {
    E data;
    BTNode lchild;
    BTNode rchild;
    public BTNode() {
        lchild = rchild = null;
    }
    public BTNode(E d) {
        data = d;
        lchild = rchild = null;
    }
}
