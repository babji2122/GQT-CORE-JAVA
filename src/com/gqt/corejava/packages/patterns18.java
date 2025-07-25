package com.gqt.corejava.packages;

import java.util.Scanner;

public class patterns18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) { 
			System.out.print(+"  ");
			count++;
			sc.close();
		}
			System.out.println();
		}

	}

}
