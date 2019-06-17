package com.lipengcheng.common.bean;

public class Person {
	private String name;
	private int age;
	private String about;
	private String created;
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Person(String name, int age, String about, String created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	public Person() {
		super();
	}
}
