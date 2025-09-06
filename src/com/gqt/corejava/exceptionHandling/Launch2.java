package com.gqt.corejava.exceptionHandling;


import java.util.Scanner;

public class Launch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();//critical statement
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();//critical statement
		
		int res = n1 / n2;//critical statement
		
		System.out.println(res);
	}
}
