package com.thor.test;

import com.thor.utils.NumberUtil;
import com.thor.utils.PersonUtil;
import com.thor.utils.StringUtil;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println("------数字工具类测试------");
		//测试一：①获取最小最大区间的随机数
		System.out.println(NumberUtil.getRandomNum(10, 100));
		
		//测试二：②获取最小最大区间多个不重复随机数
		System.out.println(NumberUtil.getRandomNums(10, 100, 5));
		
		//测试三：③获取 1 个 1-9,a-Z 之间的随机字符
		System.out.println(NumberUtil.getRandomChar());
		
		//测试四：④返回参数指定个数的随机字符串(应用场景如：验证码)
		System.out.println(NumberUtil.getRandomString(5));
		
		
		System.out.println("------字符串工具类测试------");
		
		
		//测试一：①判断源字符串是否有值，空引号(空白字符串)也算没值
		System.out.println(StringUtil.isEmpty1("123"));
		
		//测试二：②判断源字符串是否有值，空引号(空白字符串)和空格也算没值
		System.out.println(StringUtil.isEmpty2(""));
		
		//测试三：③返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文简体)范围内
		System.out.println(StringUtil.getChinese(2));
		
		//测试四：④取名工具，返回中文姓名，必须以真实姓开头，试卷中附有百家姓，名使用 1-2 个随机汉字，内部调用③方法
		System.out.println(StringUtil.getChineseName());
		
		
		System.out.println("------对象测试------");
		
		PersonUtil.getPerson();
	}
}
