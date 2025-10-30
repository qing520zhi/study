package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 位运算
 * @author: mings
 * @create: 2025-10-31 20:34
 **/
public class BitOperation {
	public static void main(String[] args) {
		// 位运算 运算符 & | ^
		// & 与 对应位都为1时，结果为1，否则为0
		// | 或 对应位都为0时，结果为0，否则为1
		// ^ 异或 对应位不同时，结果为1，否则为0
		// ~ 非 对操作数的每一位取反，即0变1，1变0
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);

		// 位移运算符 << >> >>>
		// << 左移 左移n位相当于乘以2的n次方
		// >> 右移 右移n位相当于除以2的n次方
		// >>> 无符号右移 右移n位相当于除以2的n次方，忽略符号位
		// 注意：左移时，高位丢弃，低位补0
		// 右移时，若为正数，高位补0，若为负数，高位补1
		// 无符号右移时，无论正负，高位都补0
		System.out.println(5 << 2);
		System.out.println(5 >> 2);
		System.out.println(5 >>> 2);

		int a = 10;
		int b = 20;
		System.out.println(a << 1);
		System.out.println(b >> 1);
	}
}
