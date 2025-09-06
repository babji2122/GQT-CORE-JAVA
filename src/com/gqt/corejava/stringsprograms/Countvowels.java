package com.gqt.corejava.stringsprograms;
import java.util.Scanner;
public class Countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int vowel_count=0;
		int cons_count=0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				if(str.charAt(i)=='A' || str.charAt(i)=='E' ||  str.charAt(i)=='I' ||  str.charAt(i)=='O' ||  str.charAt(i)=='U') {
					vowel_count++;
				}
				else {
					cons_count++;
				}
				System.out.println("the vowel count are:"+vowel_count);
				System.out.println("the consunant count are:"+cons_count);
			}
		}

	}


	}


