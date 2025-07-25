package com.gqt.corejava.packages;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		int m=n;
		int count=m*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) { 
			System.out.print("*");
			sc.close();
		}
			System.out.println();
		}

	}
}

