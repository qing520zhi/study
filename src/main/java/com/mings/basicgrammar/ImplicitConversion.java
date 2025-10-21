package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 隐式转换练习
 * @author: mings
 * @create: 2025-10-21 10:21
 **/
public class ImplicitConversion {
	public static void main(String[] args) {
		// 隐式转换：小范围类型向大范围类型转换 默认转换为int类型
		byte a = 10;
		short b = 20;
		//小的数据类型和大范数据类型相加，小的会提升为大的数据类型之后，再进行运算
		// byte short char 在进行运算时会提升为int类型，然后在进行运算
		int c = (a + b);
	}
}
