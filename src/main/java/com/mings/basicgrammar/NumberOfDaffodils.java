package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 水仙花数
 * @author: mings
 * @create: 2025-10-24 13:30
 **/
public class NumberOfDaffodils {
	public static void main(String[] args) {
		// 记录水仙花数个数 注意变量位置
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			// 求个位、十位、百位数字
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;
			// 判断是否为水仙花数：各位数字的立方和等于原数
			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				System.out.print(i + " ");
				count++;
				if (count % 2 == 0) {
					System.out.println();
				}
			}
		}
	}
}
