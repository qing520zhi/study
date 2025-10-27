package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 数组
 * @author: mings
 * @create: 2025-10-27 20:29
 **/
public class Array03 {
	public static void main(String[] args) {

		int[] a = new int[5];
		int max = a[0];
		int min = a[0];
		int avg = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个评委的评分：");
			//如果不用变量存储输入的评分，直接在判断语句中使用sc.nextInt()会导致读取三个输入值
			int score = sc.nextInt();
			if (0 <= score && score <= 100) {
				a[i] = score;
				sum += a[i];
				if (a[i] > max) {
					max = a[i];
				}
				if (a[i] < min) {
					min = a[i];
				}
			} else {
				System.out.println("输入错误，请输入0-100之间的评分：");
				i--;
			}
		}
		avg = (sum - max - min) / (a.length - 2);
		System.out.println("平均分是：" + avg);
	}
}
