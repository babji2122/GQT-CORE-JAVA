package com.gqt.corejava.stringsprograms;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("the resultant string is="+res);
		

	}
}


	