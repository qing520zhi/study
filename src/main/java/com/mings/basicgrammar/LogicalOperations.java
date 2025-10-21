package com.mings.basicgrammar;

/**
 * @program: study
 * @description: 逻辑运算
 * @author: mings
 * @create: 2025-10-21 11:15
 **/
public class LogicalOperations {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入a：");
		int a = Integer.parseInt(sc.next());
		System.out.println("请输入b：");
		int b = Integer.parseInt(sc.next());
		System.out.println("请输入c：");
		int c = Integer.parseInt(sc.next());
		System.out.println(c < a & a < b);*/

		// 逻辑与(&)：两个操作数都为true，结果才为true，否则为false
		System.out.println(true & false);// false
		System.out.println(true & true);// true
		System.out.println(false & true);// false
		System.out.println(false & false);// false
		System.out.println("--------------------------------------------------------------------------------");

		// 逻辑或(|)：两个操作数有一个为true，结果才为true，否则为false
		System.out.println(true | false);// true
		System.out.println(true | true);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false
		System.out.println("--------------------------------------------------------------------------------");

		// 逻辑异或(^)：两个操作数有一个为true，结果才为true，否则为false
		System.out.println(true ^ false);// true
		System.out.println(true ^ true);// false
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false
		System.out.println("--------------------------------------------------------------------------------");

		// 逻辑非(!)：取反操作，true变false，false变true
		System.out.println(!true);// false
		System.out.println(!false);// true
		System.out.println("--------------------------------------------------------------------------------");

		//短路逻辑与(&&)：两个操作数都为true，结果才为true，否则为false 当第一个操作数false时，第二个操作数不再计算
		System.out.println(true && false);// false
		System.out.println(true && true);// true
		System.out.println(false && true);// false
		System.out.println(false && false);// false
		int a = 3;
		int b = 4;
		System.out.println(++a > 4 && --b < 5);
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------------------------------------------------------------------");

		// 短路逻辑或(||)：两个操作数有一个为true，结果才为true，否则为false 当第一个操作数true时，第二个操作数不再计算
		System.out.println(true || false);// true
		System.out.println(true || true);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

	}
}