package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 数组
 * @author: mings
 * @create: 2025-10-27 20:29
 **/
public class Array01 {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b[] = new int[]{1, 2, 3, 4, 5};
		int c[] = {1, 2, 3, 4, 5};

		//[I@4eec7777
		//[:代表数组类型
		//I:代表int类型
		//@：分隔符
		//4eec7777:代表数组的十六位内存地址
		// 打印数组的地址
		System.out.println(a);
		for (int i = 0; i < a.length; i++) {
			a[i] += i;
			System.out.println(a[i]);
		}
		System.out.println(b);
		for (int j : b) {
			System.out.println(j);
		}
		System.out.println(c);
		/*
		1、类的字节码文件加载进内存中，main方法存放在字节码文件中
		2、main方法被JVM自动调用执行，进入栈内存执行
		3、变量在main方法中声明
		4、通过new关键字在堆内存中开辟空间并产生地址值，并对开辟出的空间进行划分和默认初始化
		5、将地址值赋给main方法中的变量
		*/
	}
}
