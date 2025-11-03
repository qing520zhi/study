package com.mings.basicgrammar.object;

/**
 * @program: study
 * @description: 学生类
 * @author: mings
 * @create: 2025-11-03 10:38
 **/
public class Student {
	private String name;
	private int age;
	private double score;

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
		// 判断年龄是否合法
		if (age < 0 || age > 120) {
			System.out.println("年龄不合法");
			return;
		}
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", score=" + score +
				'}';
	}

	public void show() {
		System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score);
	}
}
