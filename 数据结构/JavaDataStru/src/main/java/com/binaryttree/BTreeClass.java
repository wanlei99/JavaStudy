package com.binaryttree;

import com.sequentialStack.SecStack;
import com.sequentialStack.Stack;

/**
 * @ClassName BTreeClass
 * @Description TODO
 * @Author WL
 * @Date 2020/11/3
 **/
public class BTreeClass {
    BTNode<Character> b;
    String bstr;
    private SecStack<Object> st;

    public BTreeClass() {
        b = null;
    }

    public void CreateBTree(String str) {
        Stack<Character> p = null;
        boolean flag = true;
        char ch ;
        int i =0 ;

        while (i <str.length())
        {
            ch = str.charAt(i);
            switch (ch) {
                case '(' :
                    st.push(p);
                    break;
                case ')':
                    str.pop();
                    break;;
                case ',':
                    flag = false;
                    break;
                default:
                    p = (Stack<Character>) new BTNode<Character>(ch);
                    if (b == null) {
                        b = (BTNode<Character>) p;
                    } else {
                        if (flag) {
                            if (!str.isEmpty()) {
                                str.peek().lchild = p;
                            }
                            else {
                                if ((!str.isEmpty())) {
                                    str.peek().rchild = p;
                                }
                            }
                        }
                    }break;
            }
            i++;
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
                bstr+=")";
            }
        }
    }
    public BTNode<Character> findNode(char x)
    {
        return findNode1(b,x);
    }
    private BTNode<Character> findNode1(BTNode<Character> t, char x) {
        BTNode<Character> p;
        if (t == null) {
            return null;
        }
        else if (t.data == x){
            return t;
        } else {
            p = findNode1(t.lchild,x);
            if (p!=null) {
                return p;
            } else {
                return findNode1(t.rchild,x);
            }
        }
    }
    public int height() {
        return height1(b);
    }
    private int height1(BTNode<Character> t) {
        int lchildh,rchildh;
        if (t == null)
        {
            return 0;
        } else {
            lchildh = height1(t.lchild);
            rchildh = height1(t.rchild);
            return Math.max(lchildh,rchildh)+1;
        }
    }

}
