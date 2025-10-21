package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 条件控制语句
 * @author: mings
 * @create: 2025-10-21 14:39
 **/
public class ConditionalControlStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入周几：");
		int day = sc.nextInt();
		switch (day) {
			case 1:
				System.out.println("今天是周一");
				break;
			case 2:
				System.out.println("今天是周二");
				break;
			case 3:
				System.out.println("今天是周三");
				break;
			case 4:
				System.out.println("今天是周四");
				break;
			case 5:
				System.out.println("今天是周五");
				break;
			case 6:
				System.out.println("今天是周六");
				break;
			case 7:
				System.out.println("今天是周日");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}
}
