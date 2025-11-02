package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 二维数组
 * @author: mings
 * @create: 2025-11-02 20:57
 **/
public class TwoDArrays02 {
	public static void main(String[] args) {

		int[][] arr = new int[3][2];
		int[] arr1 = {1, 2};
		int[] arr2 = {3, 4};
		int[] arr3 = {5, 6};
		arr[0] = arr1;
		arr[1] = arr2;
		arr[2] = arr3;
		int[][] arr4 = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				sum += arr4[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}

}
