package com.lipengcheng.common.test;

import java.util.ArrayList;
import java.util.Random;

import com.lipengcheng.common.bean.Person;
import com.lipengcheng.common.utils.RandomUtil;
import com.lipengcheng.common.utils.StringUtil;

public class TestUtil {
	public static void main(String[] args) {
		//测试RandomUtil工具类
		System.out.println("------测试RandomUtil工具类------");
		System.out.println("方法一："+RandomUtil.random(1, 3));
		int[] arr = RandomUtil.subRandom(1, 10, 3);
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str +=arr[i]+" ";
		}
		System.out.println("方法二："+str);
		System.out.println("方法三："+RandomUtil.randomCharacter());
		System.out.println("方法四："+RandomUtil.randomString(3));
		
		//测试StringUtil工具类
		System.out.println("------测试StringUtil工具类------");
		System.out.println("方法一："+StringUtil.hasLength("123"));
		System.out.println("方法二："+StringUtil.hasText("abc"));
		System.out.println("方法三："+StringUtil.randomChineseString(2));
		System.out.println("方法四："+StringUtil.generateChineseName());
		
		Random random = new Random();
		
		//创建1万个Person对象
		ArrayList<Person> arrayList = new ArrayList<Person>();
		for (int i = 0; i < 10000; i++) {
			Person person = new Person();
			//姓名属性值调用StringUtil.generateChineseName()创建（4分）
			person.setName(StringUtil.generateChineseName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
			person.setAge(RandomUtil.random(1, 120));
			//介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
			person.setAbout(StringUtil.randomChineseString(140));
			//注册日期属性值模拟2010年1月1日至今任意随机时间（4分）
			person.setCreated((random.nextInt(20190617-20100101)+20100101)+"");
			arrayList.add(person);
		}
		//批量生成1万个，并在控制台输出（4分）
		for (Person person : arrayList) {
			System.out.println(person.toString());
		}
	}
}
