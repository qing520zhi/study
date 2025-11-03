package com.mings.basicgrammar;

import com.mings.basicgrammar.object.Student;

/**
 * @program: study
 * @description: 类的运用
 * @author: mings
 * @create: 2025-11-03 13:55
 **/
public class Object02 {
	public static void main(String[] args) {

		Student s = new Student();
		s.setName("小王");
		s.setAge(18);
		s.setScore(90.0);
		System.out.println(s);
		s.show();
	}
}
