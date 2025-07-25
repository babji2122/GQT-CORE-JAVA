package com.gqt.corejava.packages;
import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		int c=1;
		int m=n;
		for(int i=m;i>=1;i--) {
			for(int j=1;j<=i;j++) { 
			System.out.print(c+" ");
			c++;
		}
			System.out.println();
			sc.close();
		}

	}

}
