package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 方法03
 * @author: mings
 * @create: 2025-10-29 21:09
 **/
public class Method03 {
	public static void main(String[] args) {

		int a = 100;
		int[] b = {1, 2, 3};
		System.out.println("a=" + a);
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "]=" + b[i] + " ");
		}
		//传递基本类型参数时，形参的改变不会影响实参
		change(a);
		//改变引用类型参数时，形参的改变会影响实参 传递的是数组的地址
		change(b);
		System.out.println("a=" + a);
		System.out.println("b[2]=" + b[2]);
	}

	public static void change(int a) {
		a = 1000;
	}

	public static void change(int[] b) {
		b[2] = 1000;
	}
}
