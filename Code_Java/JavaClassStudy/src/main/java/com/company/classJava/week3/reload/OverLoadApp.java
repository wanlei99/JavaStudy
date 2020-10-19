package com.company.classJava.week3.reload;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName OverLoadApp
 * @Description TODO
 * @Author WL
 * @Date 2020/10/19
 **/
public class OverLoadApp {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            //System.out.println("程序运行开始时间：" + new Date() + "\n");
            Thread.sleep(7*60*10);
            //System.out.println("程序运行结束时间：" + new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end + start;
            //System.out.println("两者时间和为 :"+ diff + "毫秒" + "\n");
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar = Calendar.getInstance();
            Calendar calendar1 = Calendar.getInstance();
            calendar2.setTimeInMillis(diff);
            int year = calendar2.get(Calendar.YEAR);
            int month = calendar2.get(Calendar.MONTH);
            int day = calendar2.get(Calendar.DAY_OF_MONTH);
            int hour = calendar2.get(Calendar.HOUR_OF_DAY);
            int minute = calendar2.get(Calendar.MINUTE);
            int second = calendar2.get(Calendar.SECOND);

            calendar.setTimeInMillis(start);
            int second1 = calendar.get(Calendar.SECOND);

            calendar1.setTimeInMillis(end);
            int second2 = calendar1.get(Calendar.SECOND);

            System.out.println("两秒数相加后秒数:" + (second2 + second1)+"\n");

            //System.out.println("转换后的时间为：" + year + "年" + (month + 1) + "月" + day + "日"
                    //+ hour + "时" + minute + "分" + second + "秒");


        }catch (Exception e){
            System.out.println("Got an exception!");
        }
    }
}
