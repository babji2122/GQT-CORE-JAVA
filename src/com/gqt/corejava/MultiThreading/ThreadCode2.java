package com.gqt.corejava.MultiThreading;

import java.util.Scanner;

public class ThreadCode2 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result = "+res);
		System.out.println("Addition Operation completed");
		
		System.out.println("Prining Operation Started");
		for(int i=1;i<=10;i++) {
			System.out.println("Happy 6 years to GQT");
			Thread.sleep(3000);
		}
		System.out.println("Prining Operation completed");
		
		System.out.println("Banking Operation Started");
		System.out.println("Enter the account number : ");
		int accno = sc.nextInt();
		System.out.println("Enter the pin number : ");
		int pin = sc.nextInt();
		System.out.println("data entered");
		System.out.println("Banking Operation completed");
		
	}
}
