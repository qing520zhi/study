package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 二维数组
 * @author: mings
 * @create: 2025-11-02 20:57
 **/
public class TwoDArrays {
	public static void main(String[] args) {
		// 二维数组的定义
		// int[][] arr = new int[3][2];
		int[][] arr = {{1, 2,}, {4, 5}, {7, 8}};
		// int[] arr1[][] = new int[3][2];
		int[] arr1[] = {{2, 3}, {5, 6}, {8, 9}};
		// int arr2[][] = new int[3][3];
		int arr2[][] = {{1, 3}, {4, 6}, {7, 9}};

		address(arr);
		address(arr1);
		address(arr2);
	}

	public static void address(int[][] arr) {
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
