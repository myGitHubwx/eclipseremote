package com.wx.model;

public class Student {
	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
