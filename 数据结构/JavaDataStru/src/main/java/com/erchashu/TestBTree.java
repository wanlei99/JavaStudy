package com.erchashu;

import javax.sql.rowset.BaseRowSet;

/**
 * @ ClassName TestBTree
 * @ Description TODO
 * @ Author faine
 * @ Date 2020/11/3
 */
public class TestBTree {
/**    public static void main(String[] args) {
        BTreeClass bTree = new BTreeClass();
        bTree.createBTree("(a,(d,f)),(b),(c),(d,q)");
        System.out.println("==========>二叉树高度"+bTree.height());
        System.out.println(bTree.findNode('a').data);
        System.out.println(bTree.toString());
    }
 */
        public static void main(String[] args) {
            String data;
            data = "A(B(D(,F(H))),C(,E(G))";
            System.out.println("括号表示法：" + data);
            BTreeClass btree = new BTreeClass();
            btree.createBTree(data);
            System.out.println("高度为:" + btree.height());
            System.out.println("先序序列：");
            btree.PreOrder1(btree);
            System.out.println();
            System.out.println("中序序列：");
            btree.InOrder1(btree);
            System.out.println();
            System.out.println("后序序列：");
            btree.PostOrder1(btree);
}
}
