package com.thor.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 数字工具类
 * @author Thor Li
 * 2019年6月14日下午6:58:09
 * ①获取最小最大区间的随机数；
 * ②获取最小最大区间多个不重复随机数；
 * ③获取 1 个 1-9,a-Z 之间的随机字符；
 * ④返回参数指定个数的随机字符串(应用场景如：验证码)。
 */
public class NumUtil {

	public static void main(String[] args) {
		System.out.println(randomTest(1, 3));
		
		int[] arr = manyNumOfRandom(1, 15);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println(getAge());
		System.out.println(getRendomNum(0, 0));
		System.out.println(isMobile("13319513251"));
		System.out.println(reverse("qwer"));
		System.out.println("3："+charOfRandom());
	}
	
	/**
	 * ①获取最小最大区间的随机数
	 * Math.random()*(n-m)+m
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randomTest(int min , int max) {
		int num = (int) (Math.random()*(max-min)+min);
		if (num==min) {
			num = (int) (Math.random()*(max-min)+min);
		} 
		return num;
	}
	
	/**
	 * ②获取最小最大区间多个不重复随机数
	 * @return
	 */
	public static int[] manyNumOfRandom(int min , int max) {
		int length = (int) (Math.random()*(max-min)+min);
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			int num = (int) (Math.random()*(max-min)+min);
			arr[i]=num;
		}
		return arr;
	}
	
	/**
	 * ③获取 1 个 1-9,a-Z 之间的随机字符
	 */
	public static char charOfRandom() {
		String chars = "123456789qwertyuiopasdfghjklzxcvbnm";
		char[] arr = chars.toCharArray();
		Random random = new Random();
		int i = random.nextInt(chars.length());
		return arr[i];
	}
	/**
	 * 方法1：随机获取以下年龄:”2,59,89,79,54,23,12,34,26,67,78,89,97” (5分)
	 */
	public static String getAge(){
		String ages = "2,59,89,79,54,23,12,34,26,67,78,89,97";
		String[] arr = ages.split(",");
		int index = (int) (Math.random()*(arr.length-1));
		return arr[index];
	}
	
	/**
	 * 方法2：随机获取不重复的10位数字(5分)
	 */
	public static HashSet<Long> getRendomNum(long startNum, long endNum){
		
		return null;
	}
	
	/**
	 * 方法3：判断是否为手机号码 (5分)
	 */
	public static boolean isMobile(String phoneNum){
		String regex = "^1[3|4|5|6|7|8][0-9]\\d{8}$";
		if (phoneNum.length()==11) {
			Pattern compile = Pattern.compile(regex);
			Matcher matcher = compile.matcher(phoneNum);
			boolean matches = matcher.matches();
			return matches;
		}
		return false;
	}
	
	/**
	 * 方法4：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	 */
	public static String reverse(String s){
		String s1="";
		char[] arr = s.toCharArray();
		for (int i = arr.length-1; i >=0 ; i--) {
			s1+=arr[i];
		}
		return s1;
	}
}
