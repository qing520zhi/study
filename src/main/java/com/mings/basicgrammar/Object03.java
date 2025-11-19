package com.mings.basicgrammar;

import com.mings.basicgrammar.object.Teacher;

/**
 * @program: study
 * @description: 标准类的使用
 * @author: mings
 * @create: 2025-11-05 09:19
 **/
public class Object03 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("小王");
		t.setAge(18);
		t.show();
		System.out.println(t);
		Teacher t1 = new Teacher("小王", 18);
		t1.show();
	}
}
