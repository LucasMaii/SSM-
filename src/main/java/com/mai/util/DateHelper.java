package com.mai.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间，并且返回字符串
 * @Author Lucas_mai
 * @Date 2021/4/24 ^_^
 */
public class DateHelper {

    public static String getCurrentDate(){
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date());
    }

    public static String getCurrentDateStr(){
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
        return dateFormat.format(new Date());
    }

    public static String dateToString(){
        return null;
    }
}
