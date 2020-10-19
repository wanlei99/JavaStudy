package com.company.classJava.week3.datetime;

import lombok.val;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName FormatUtilApp
 * @Description TODO
 * @Author WL
 * @Date 2020/10/19
 **/
public class FormatUtilApp {
    public static void main(String[] args) {
        try {
        //获取当前时间
        Date date = new Date();
        //创建一个FormatUtil对象
        FormatUtil formatUtil = new FormatUtil();

        System.out.println("时间格式为yyyy-MM-dd HH:mm:ss：" + formatUtil.format(date) + "\n");
        //自定义格式化数据
        System.out.println(formatUtil.format(555.66667777,".##"));

        System.out.println("**************************");
        //获取当前时间的毫秒数
        long start = System.currentTimeMillis();
        System.out.println("现在的时间戳为：" + start);
        //让主线程休眠3秒钟
            Thread.sleep(3000);
            long end = System.currentTimeMillis();
            System.out.println("两个时间戳的差值为：" + (end - start));
            System.out.println("经过了" + (end - start) / 1000 + "秒");
            System.out.println("************************");
            //将指定格式的时间表达式，解析为一个Date对象
            //时间戳是从1978-01-11 00:00:00开始的，我们在东八区规范表示时间表示为： 2020-10-19 22:41:00+0800
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
            //丢出异常
            try {
                long unknown = sdf.parse("2020-10-19 22:41:00+0000").getTime();
                System.out.println("一个未知的时间戳:" + unknown);
                System.out.println("和我们此刻的时间差：" + Math.abs(unknown - System.currentTimeMillis()) / 1000 / 3600 + "个小时");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
