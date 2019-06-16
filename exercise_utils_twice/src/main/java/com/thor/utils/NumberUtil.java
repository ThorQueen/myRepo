package com.thor.utils;

import java.util.HashSet;
import java.util.Random;

public class NumberUtil {

	/**
	 * ①获取最小最大区间的随机数
	 */
	public static int getRandomNum(int min , int max) {
		int num = (int) (Math.random()*(max-min)+min);
		return num;
	}
	
	/**
	 * ②获取最小最大区间多个不重复随机数
	 */
	public static String getRandomNums(int min , int max , int nums) {
		HashSet<Integer> aSet = new HashSet<Integer>();
		String str = "";
		while (aSet.size()<nums) {
			aSet.add((int) (Math.random()*(max-min)+min));
		}
		for (Integer integer : aSet) {
			str += "," +integer;
		}
		str = str.substring(1);
		return str;
	}
	
	/**
	 * ③获取 1 个 1-9,a-Z 之间的随机字符
	 */
	public static char getRandomChar() {
		String chars = "123456789qwertyuiopasdfghjklzxcvbnm";
		char[] arr = chars.toCharArray();
		Random random = new Random();
		return arr[random.nextInt(arr.length)];
	}
	
	/**
	 * ④返回参数指定个数的随机字符串(应用场景如：验证码)
	 */
	public static String getRandomString(int length) {
		String str = "qwertyuiopasdfghjklzxcvbnm";
		char[] arr = str.toCharArray();
		Random random = new Random();
		String strs = "";
		for (int i = 0; i < length; i++) {
			strs +=arr[random.nextInt(arr.length)];
		}
		return strs.toUpperCase();
	}
}
