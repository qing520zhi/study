package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 方法求取数组最大值
 * @author: mings
 * @create: 2025-10-30 14:33
 **/
public class Method04 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int max = getMax(arr);
		System.out.println(max);
		int min = getMin(arr);
		System.out.println(min);
		int[] result = getMaxAndMin(arr);
		System.out.println("max=" + result[0]);
		System.out.println("min=" + result[1]);
	}

	/**
	 * @Description: 获取整型数组中的最小值
	 * @Param: arr 输入的整型数组
	 * @return: 数组中的最小值
	 * @Author: mings
	 * @Date: 2025/10/30
	 */
	public static int getMin(int[] arr) {
		int min = arr[0];
		// 遍历数组找到最小值
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	/**
	 * @Description: 获取整型数组中的最大值
	 * @Param: arr 输入的整型数组
	 * @return: 数组中的最大值
	 * @Author: mings
	 * @Date: 2025/10/30
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * @Description: 获取整型数组中的最大值和最小值
	 * @Param: arr 输入的整型数组
	 * @return: 包含最大值和最小值的数组，第一个元素为最大值，第二个元素为最小值
	 * @Author: mings
	 * @Date: 2025/10/30
	 */
	public static int[] getMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int[] result = {max, min};
		return result;
	}
}
