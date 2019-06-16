package com.thor.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author Thor Li
 * 2019年6月14日下午3:05:39
 */
public class DateUtil {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(getDateByInitMonth(date));
	}
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static String getDateByInitMonth(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, date.getMonth()+1);
		int actualMinimumOfDay = calendar.getActualMinimum(Calendar.MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, actualMinimumOfDay);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String format = dateFormat.format(calendar.getTime());
		return format;
	}
	
}
