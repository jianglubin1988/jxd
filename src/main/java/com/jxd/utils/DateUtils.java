package com.jxd.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMddHHmmss");

    public static String getCurrentTime(){
        return format.format(new Date());
    }

    public static String getCurrentTimeNo(){
        return format2.format(new Date());
    }
}
