package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 类与对象
 * @author: mings
 * @create: 2025-11-03 09:45
 **/
public class Object01 {
	public static void main(String[] args) {
		// 创建对象
		Person p1 = new Person();
		p1.name = "小王";
		p1.age = 18;
		p1.eat();
		System.out.println(p1);
	}
}

class Person {
	// 属性
	String name;
	int age;

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

	// 方法
	public void eat() {
		System.out.println("吃饭");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
