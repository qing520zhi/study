package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 数组反转
 * @author: mings
 * @create: 2025-11-02 20:46
 **/
public class ArrayInversion {
	public static void main(String[] args) {

		int[] arr = {19, 28, 37, 46, 55};
		// 数组反转
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
