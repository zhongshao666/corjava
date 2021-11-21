package com.briup.exercise16;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化
 */
public class DateFormatUtils {

    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static String dateToStr(Date date){
        return format.format(date);
    }
}
