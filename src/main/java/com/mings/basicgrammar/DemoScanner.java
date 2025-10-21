package com.mings.basicgrammar;

import java.util.Scanner;

/**
 * @program: study
 * @description: 键盘录入练习
 * @author: mings
 * @create: 2025-10-21 10:10
 **/
public class DemoScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String next = sc.next();
        System.out.println("您输入的用户名是：" + next);
    }
}
