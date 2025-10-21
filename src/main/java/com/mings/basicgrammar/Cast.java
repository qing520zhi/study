package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 强制类型转换
 * @author: mings
 * @create: 2025-10-21 10:32
 **/
public class Cast {
	public static void main(String[] args) {
		// 强制类型转换：大范围类型向小范围类型转换 可能会损失精度
		byte a = 10;
		short b = 20;
		byte c = (byte) (a + b);
		System.out.println("Result of explicit conversion: " + c);

		double d = 10.5555555555555;
		float e = 20.1111111111111111f;
		// 强制类型转换：double向float转换 可能会损失精度
		float f = (float) (d + e);
		double g = d + e;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

		// 常量优化机制 自动类型转换 如果超出byte的范围，编译会报错
		byte h = 10 + 3;
		System.out.println(h);
	}
}
