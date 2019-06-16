package com.thor.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.thor.bean.Person;

/**
 * 在 Maven 的测试包中测试所编写的工具方法，
 * 具体是批量生成 1 万个Person 对象(姓名、年龄、介绍、生成日期等等)，要求使用到上述方法。
 * @author Thor Li
 * 2019年6月16日下午8:33:18
 */
public class PersonUtil {
	
	public static void getPerson() {
		ArrayList<Person> arrayList = new ArrayList<Person>();
		for (int i = 0; i <10; i++) {
			Person person = new Person();
			person.setName(StringUtil.getChineseName());
			person.setAge(NumberUtil.getRandomNum(1, 100));
			person.setDescription(StringUtil.getChinese(10));
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String format = dateFormat.format(date);
			person.setCreateDate(format);
			arrayList.add(person);
		}
		for (Person person : arrayList) {
			System.out.println(person.toString());
		}
	}
}
