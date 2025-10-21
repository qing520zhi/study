package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 循环语句
 * @author: mings
 * @create: 2025-10-21 14:53
 **/
public class LoopStatement {
	public static void main(String[] args) {
		int i = 1, j = 1, k = 1;
		for (; i < 10; i++) {
			System.out.print(i + " ");
			i += i;
		}
		System.out.println(i);
		while (j < 10) {
			System.out.print(j + " ");
			j += j;
		}
		System.out.println(j);
		do {
			System.out.print(k + " ");
			k += k;
		} while (k < 10);

		System.out.println("请输入一个数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (double m = 0.2; m <= num; m++) {
			m *= 2;
			count++;
		}
		System.out.println("折叠" + count + "次" + "才能大于" + num);
	}
}
