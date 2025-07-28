/**
 * 
 */
package com.gqt.corejava.patternnew;

import java.util.Scanner;

/**
 * @author Babji
 * categeory patterns
 * @description This is an example for conditional patterns
 * 
 */
public class newpattern2 {

	/**
	 * @param args
	 * @description This is contains source code for the patterns
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			if (i==0 || i==(n-1) || j==0 || j==i) 
			{
				System.out.print("# ");
			}
			else {
				System.out.print("- ");
			}
		}
       System.out.println();
       sc.close();
		}
	}
}
