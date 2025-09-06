package com.gqt.corejava.stringsprograms;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("checking the string is palindrome or not");
		if(str.equals(res)==true) {
			System.out.println("string is paindrome:");
		}
		else {
			System.out.println("not a paindrome:");
		}
	}



	}
