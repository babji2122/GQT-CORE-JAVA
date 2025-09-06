package com.gqt.corejava.stringsprograms;

import java.util.Scanner;

public class ReplaceInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		//for the uppercaseletter
		str = str.replace('A','$');
		str = str.replace('E', '#');
		str = str.replace('I','*');
		str = str.replace('O','@');
		str = str.replace('U','&');
		
		//for the lower case letter
		str = str.replace('a','$');
		str = str.replace('e','#');
		str = str.replace('i','*');
		str = str.replace('o','@');
		str = str.replace('u','&');

	}

}
