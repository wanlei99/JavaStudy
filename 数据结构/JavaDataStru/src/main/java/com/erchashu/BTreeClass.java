package com.erchashu;

import java.util.Stack;

/**
 * @ClassName BTreeClass
 * @Description TODO
 * @Author Finger
 * @Date 11/3/2020
 **/
public class BTreeClass {
    BTNode<Character> b;
    String bstr;

    public BTreeClass() {
        b = null;
    }

    public void createBTree(String str) {
        Stack<BTNode<Character>> st = new Stack<>();
        BTNode<Character> p = null;
        boolean flag = true;
        char ch;
        int i = 0;
        while (i < str.length()) {
            ch = str.charAt(i);
            switch (ch) {
                case '(':
                    st.push(p);
                    flag = true;
                    break;
                case ')':
                    st.pop();
                    break;
                case ',':
                    flag = false;
                    break;
                default:
                    p = new BTNode<>(ch);
                    if (b == null) {
                        b = p;
                    } else {
                        if (flag) {
                            if (!st.empty()) {
                                st.peek().lchild = p;
                            }
                        } else {
                            if (!st.empty()) {
                                st.peek().rchild = p;
                            }
                        }
                    }
                    break;
            }
            i++;
        }
    }

    public BTNode<Character> findNode(char x) {
        return findNode1(b, x);
    }

    private BTNode<Character> findNode1(BTNode<Character> t, char x) {
        BTNode<Character> p;
        if (t == null) {
            return null;
        } else if (t.data == x) {
            return t;
        } else {
            p = findNode1(t.lchild, x);
            if (p != null) {
                return p;
            } else {
                return findNode1(t.rchild, x);
            }
        }
    }


    public int height() {
        return height1(b);
    }

    private int height1(BTNode<Character> t) {
        int lchildh, rchildh;
        if (t == null) {
            return 0;
        } else {
            lchildh = height1(t.lchild);
            rchildh = height1(t.rchild);
            return Math.max(lchildh, rchildh) + 1;
        }
    }


    @Override
    public String toString() {
        bstr = "";
        toString1(b);
        return bstr;
    }

    private void toString1(BTNode<Character> t) {
        if (t != null) {
            bstr += t.data;
            if (t.lchild != null || t.rchild != null) {
                bstr += "(";
                toString1(t.lchild);
                if (t.rchild != null) {
                    bstr += ",";
                }
                toString1(t.rchild);
                bstr += ")";
            }
        }
    }

    public void PreOrder1(BTreeClass bt) {  //先序遍历的递归算法
        PreOrder11(bt.b);
    }

    private void PreOrder11(BTNode<Character> t) {
        if (t != null) {
            System.out.print(t.data + " ");
            PreOrder11(t.lchild);
            PreOrder11(t.rchild);
        }
    }

    public void InOrder1(BTreeClass bt) {  //中序遍历的递归算法
        InOrder11(bt.b);
    }

    private void InOrder11(BTNode<Character> t) {
        if (t!= null) {
            InOrder11(t.lchild);
            System.out.print(t.data + " ");
            InOrder11(t.rchild);
        }
    }

    public void PostOrder1(BTreeClass bt) {  //后序遍历的递归算法
        PostOrder11(bt.b);
    }
    private void PostOrder11(BTNode<Character> t) {
        if (t!= null) {
            PostOrder11(t.lchild);
            PostOrder11(t.rchild);
            System.out.print(t.data + " ");

        }
    }
}