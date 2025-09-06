package com.gqt.corejava.stringsprograms;
import java.util.Scanner;
public class ReplaceVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		str=str.toUpperCase();
		str=str.replace('A', '$');
		str=str.replace('E', '$');
		str=str.replace('I', '$');
		str=str.replace('O', '$');
		str=str.replace('U', '$');
		System.out.println(str);
	}
}
