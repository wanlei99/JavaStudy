package com.company.classJava.week3.datetime;

import javax.xml.crypto.Data;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName 时间操作
 * @Description 格式化工具类
 * @Author WL
 * @Date 2020/10/19
 **/

public class FormatUtil {
    /**
     * 将Date对象格式化为“yyyy-MM-dd HH:mm:ss"的格式
     * @param date
     * @return
     */
    public String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 将Date对象格式化为指定时区的字符串时间
     * @param date
     * @param tz
     * @return
     */
    public String format(Date date, Locale tz) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",tz);
        sdf.setTimeZone(TimeZone.getTimeZone("GTM+8"));
        return sdf.format(date.getTime());
    }

    /**
     * 将入参的double数据格式化两位小数返回
     * @param number
     * @return
     */
    public String format(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(number);
    }

    /**
     * 将入参的double数据格式化为指定格式返回
     * @param number
     * @param pattern
     * @return
     */
    public String format(double number , String pattern) {
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(number);
    }

}
