package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 三元运算符
 * @author: mings
 * @create: 2025-10-21 14:26
 **/
public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a：");
		int a = sc.nextInt();
		System.out.println("请输入b：");
		int b = sc.nextInt();
		// 三元运算符：(条件表达式) ? 表达式1 : 表达式2
		// 如果条件表达式为true，返回表达式1的值；否则返回表达式2的值
		int c = a > b ? a : b;
		System.out.println(c);
	}
}
