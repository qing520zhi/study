package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 数组02
 * @author: mings
 * @create: 2025-10-28 08:36
 **/
public class Array02 {
	public static void main(String[] args) {
		int[] a = new int[]{22, 85, 95, 50, 66};
		/*Scanner sc = new Scanner(System.in);
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素：");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("最大值为：" + max);*/
		System.out.println("请输入要查询的元素：");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == select) {
				System.out.println("元素" + select + "的下标为：" + i);
				break;
			} else if (i == a.length - 1) {
				System.out.println("未找到元素" + select);
			}
		}
	}
}
