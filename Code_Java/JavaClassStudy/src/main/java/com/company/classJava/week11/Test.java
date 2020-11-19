package com.company.classJava.week11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName Test
 * @Description TODO
 * @Author WL
 * @Date 2020/11/16
 **/
public class Test {
    public static void main(String[] args) {
        Map<String, String> classMap = new HashMap<>();
        classMap.put("Tom","CoreJava");
        classMap.put("Jhon","Oracle");
        classMap.put("Susan","Oracle");
        classMap.put("Jerry","JDBC");
        classMap.put("Jim","Unix");
        classMap.put("Kevin","JSP");
        classMap.put("Lucy","JSP");
        //增加一位新老师
        classMap.put("Allen","JDBC");
        //将Lucy改为教CoreJava
        classMap.put("Lucy","CoreJava");
        //通过Iterator遍历
        System.out.println("通过Iterator遍历:");
        Iterator<Map.Entry<String, String>> iterator = classMap.entrySet().iterator();
        Map.Entry<String, String> entry = null;
        while (iterator.hasNext()) {
             entry = iterator.next();
            System.out.print(entry.getKey()+" 教授的课程为：" + entry.getValue());
            if (entry.getValue().equals("JDBC")) {
                System.out.println(" 教授JDBC的老师为："+entry.getKey());
            }
        }
        System.out.println();
        System.out.println("Lambda遍历");
        classMap.forEach((key , value)-> {System.out.print(key + " 教授的课程为："+ value);
        if (value.equals("JDBC")){
            System.out.println(" 教授JDBC的老师为：" + key);
        }
        });

    }
}
