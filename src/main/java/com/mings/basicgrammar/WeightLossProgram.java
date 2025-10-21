package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 减肥计划
 * @author: mings
 * @create: 2025-10-27 10:07
 **/
public class WeightLossProgram {
	public static void main(String[] args) {
		System.out.println("今天是星期几？");
		io:
		while (true) {
			Scanner sc = new Scanner(System.in);
			int day = sc.nextInt();
			switch (day) {
				case 0:
					System.out.println("退出计划");
					break io;
				case 1:
					System.out.println("跑步");
					break;
				case 2:
					System.out.println("游泳");
					break;
				case 3:
					System.out.println("骑行");
					break;
				case 4:
					System.out.println("俯卧撑");
					break;
				case 5:
					System.out.println("哑铃");
					break;
				case 6:
					System.out.println("健身操");
					break;
				case 7:
					System.out.println("休息一下");
					break;
				default:
					System.out.println("输入错误");
					break;
			}
		}

	}
}
