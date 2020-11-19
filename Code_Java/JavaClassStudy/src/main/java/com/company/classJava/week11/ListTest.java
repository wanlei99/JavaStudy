package com.company.classJava.week11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @ClassName ListTest
 * @Description List接口测试程序
 * @Author WL
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        //创界一个list接口的实现对象，泛型为String
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java");
        list.add("JavaScript");
        list.add("Java");
        //随机取出list中的某个元素
        System.out.println("随机取出list中的某个元素:");
        Random random = new Random();
        String s = list.get(random.nextInt(list.size()));

        //用for循环遍历list
        for (String s1 : list) {
            System.out.println(s1 + " ");
        }
        //用Iterator迭代器遍历list
        System.out.println("用Iterator迭代器遍历list:");
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");
        }
        //用Lambda表达式遍历list
        System.out.println("用Lambda表达式遍历list:");
        list.forEach(s2 -> System.out.println(s2));
        System.out.println("用Lambda表达式遍历list,终极方法：");
        list.forEach(System.out::print);
    }
}
