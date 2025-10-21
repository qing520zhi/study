package com.mings.basicgrammar;

import java.util.Random;
import java.util.Scanner;

/**
 * @program: study
 * @description: 随机数
 * @author: mings
 * @create: 2025-10-27 10:16
 **/
public class RandomNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		System.out.println(number);
		System.out.println("请您猜一个1到100之间的整数：");
		while (true) {
			Scanner sc = new Scanner(System.in);
			int guessnumber = sc.nextInt();
			if (guessnumber < number) {
				System.out.println("您猜的数字小了！");
			} else if (guessnumber > number) {
				System.out.println("您猜的数字大了！");
			} else {
				System.out.println("恭喜您，猜对了！");
				break;
			}
		}
	}
}
