package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 循环语句
 * @author: mings
 * @create: 2025-10-21 14:53
 **/
public class LoopStatement {
	public static void main(String[] args) {
		int i = 0;
		for (; i < 10; i++) {
			i += i;
		}
		System.out.println(i);
	}
}
