package com.thor.bean;

import java.util.Date;

/**
 * 在 Maven 的测试包中测试所编写的工具方法，
 * 具体是批量生成 1 万个Person 对象(姓名、年龄、介绍、生成日期等等)，要求使用到上述方法。
 * @author Thor Li
 * 2019年6月16日下午8:32:09
 */
public class Person {
	private String name;
	private int age;
	private String description;
	private String createDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Person(String name, int age, String description, String createDate) {
		super();
		this.name = name;
		this.age = age;
		this.description = description;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", description=" + description + ", createDate=" + createDate
				+ "]";
	}
	public Person() {
		super();
	}
}
