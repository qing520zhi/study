package com.mings.basicgrammar;

/**
 * @program: study
 * @description:方法的定义和调用
 * @author: mings
 * @create: 2025-10-28 09:57
 **/
public class Method01 {
	public static void main(String[] args) {
		print();
		print2();
		print3(20, 50);
	}

	/**
	 * @Description: 打印hello world
	 * @Param:
	 * @return: void
	 * @Author: mings
	 * @Date: 2025/10/28
	 */
	public static void print() {
		System.out.println("hello world");
	}

	private static void print2() {
		System.out.println("hello world2");
	}

	public static void print3(int n, int m) {
		for (int i = n; i < m; i++)
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
	}
}
