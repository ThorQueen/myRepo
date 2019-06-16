package com.thor.person;

import java.util.Date;

public class Person1 {
	private String name;
	private int age;
	private String description;
	private Date pdate;
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
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Person1(String name, int age, String description, Date pdate) {
		super();
		this.name = name;
		this.age = age;
		this.description = description;
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", description=" + description + ", pdate=" + pdate + "]";
	}
	public Person1() {
		super();
	}
}
