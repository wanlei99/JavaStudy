package com.company.classJava.week11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description Set接口测试
 * @Author WL
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        System.out.println("下面一个Student类：");
        Student student1 = Student.builder().age(22).name("aaa").build();
        Student student2 = Student.builder().age(12).name("baa").build();
        Student student3 = Student.builder().age(18).name("caa").build();
        System.out.println("这是一个TreeSet");
        Set<Student> stu = new TreeSet<>();
        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        System.out.println(stu);
        System.out.println("这是一个HashSet");
        Set<Student> hashStu = new HashSet<>();
        hashStu.add(student1);
        hashStu.add(student2);
        hashStu.add(student3);
        System.out.println(hashStu);
        //System.out.println("下面是hashSet的例子：");
        //Set<String> hashSet = new HashSet<>();
        //hashSet.add("A");
        //hashSet.add("B");
        //hashSet.add("C");
        ////使用for循环遍历
        //System.out.println("使用for循环遍历");
        //for (String h : hashSet) {
        //    System.out.println(h);
        //}
        ////使用iterator遍历
        //System.out.println("使用iterator遍历:");
        //Iterator<String> iterator = hashSet.iterator();;
        //while (iterator.hasNext()) {
        //    System.out.println(iterator.next() + ",");
        //}
        ////用Lambda表达式遍历list
        //System.out.println("用Lambda表达式遍历set:");
        //hashSet.forEach(h1 -> System.out.println(h1));
        //System.out.println("用Lambda表达式遍历set的终极方式:");
        //hashSet.forEach(System.out::print);
        //System.out.println("下面是TreeSet的例子：");
        //Set<String> set = new TreeSet<>();
        //set.add("A");
        //set.add("B");
        //set.add("C");
        ////使用for循环遍历
        //System.out.println("使用for循环遍历");
        //for (String s : set) {
        //    System.out.println(s);
        //}
        ////使用iterator遍历
        //System.out.println("使用iterator遍历:");
        //Iterator<String> iterator1 = set.iterator();;
        //while (iterator1.hasNext()) {
        //    System.out.println(iterator1.next() + ",");
        //}
        ////用Lambda表达式遍历list
        //System.out.println("用Lambda表达式遍历set:");
        //set.forEach(s1 -> System.out.println(s1));
        //System.out.println("用Lambda表达式遍历set的终极方式:");
        //set.forEach(System.out::print);
    }
}
