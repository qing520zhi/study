package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 方法02
 * @author: mings
 * @create: 2025-10-28 20:57
 **/
public class Method02 {
	public static void main(String[] args) {
		/*int sum = sum(10, 20);
		System.out.println(sum);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个个数字：");
		int b = sc.nextInt();
		int c = 50;
		int max = max(a, b);
		System.out.println(max);
		int max2 = max(a, b, c);
		System.out.println(max2);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int max(int a, int b) {
		return Math.max(a, b);
	}

	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static int max(byte a, byte b) {
		return Math.max(a, b);
	}

	public static int max(short a, short b) {
		return Math.max(a, b);
	}
}
