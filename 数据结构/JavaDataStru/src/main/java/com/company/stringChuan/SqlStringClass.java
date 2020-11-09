package com.company.stringChuan;

import java.lang.reflect.Array;

/**
 * @ClassName SqlStringClass
 * @Description 串的创建,顺序串
 * @Author WL
 * @Date 2020/10/13
 **/


public class SqlStringClass {
    public static void main(String[] args) {
        char[] letter = {'a','b','c'};
        char[] letter1 = {'c','d','e'};
        SqlStringClass str = new SqlStringClass(letter);
        SqlStringClass str1 = new SqlStringClass(letter1);
        SqlStringClass strTest = new SqlStringClass(letter1);
        System.out.println(strTest.data);

    }
    public static int strCmp(SqlStringClass s, SqlStringClass t) {
        int comLen;
        if (s.size < t.size) {
            return 1;
        } else {
            comLen = t.size;
        }
        for (int i = 0; i < comLen; i++) {
            if (s.data[i] > t.data[i]) {
                return 1;
            } else if (s.data[i] < t.data[i]) {
                return -1;
            }
        }
        if (s.size == t.size) {
            return 0;
        } else if (s.size > t.size) {
            return 1;
        } else {
            return -1;
        }

    }



    final int MaxSize = 100;
    char[] data;
    int size;
    private char[] value;

    public SqlStringClass(char[] value) {
        this.value = value;
        data = new char[MaxSize];
        size = 0;
    }
    public SqlStringClass(){

    }
    /**
     * 创建一个空串s，当参数正确时，
     */
    public SqlStringClass SubStr(int i, int j) {
        SqlStringClass s = new SqlStringClass();
        if (i < 0 || i >= size || j < 0 || i + j > size) {
            return s;
        }
        for (int k = i; k <= i + j; k++) {
            s.data[k - i] = data[k];
        }
        s.size = j;
        return s;
    }


}

