package com.mings.basicgrammar.object;

/**
 * @program: study
 * @description: 教师类
 * @author: mings
 * @create: 2025-11-05 09:16
 **/
public class Teacher {
	private String name;
	private int age;

	// 无参构造方法
	public Teacher() {
	}

	// 带参构造方法
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public void show() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}
