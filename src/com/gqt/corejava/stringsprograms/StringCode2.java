package com.gqt.corejava.stringsprograms;

public class StringCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =  ("RAMA");
		String s2 =  ("RAMA");
		String s3 =  ("rama");
		String s4 =  ("SITA");
		System.out.println("case-1:same strings");
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("strings equal");
		}
		else {
			System.out.println("strings not equal");
		}
		System.out.println("--------------");
		if(s1==s2) {
			System.out.println("Reference equal");
		}
		else {
			System.out.println("Reference not equal");
		}
		System.out.println("================");
		System.out.println("case-2:Different strings");
		if(s1.equalsIgnoreCase(s4)==true) {
			System.out.println("strings equal");
		}
		else {
			System.out.println("strings not equal");
		}
		System.out.println("--------------");
		if(s1==s4) {
			System.out.println("Reference equal");
		}
		else {
			System.out.println("Reference not equal");
		}
		System.out.println("================");
		System.out.println("case-3:same string but different case ");
		if(s1.equalsIgnoreCase(s3)==true) {
			System.out.println("strings equal");
		}
		else {
			System.out.println("strings not equal");
		}
		System.out.println("--------------");
		if(s1==s3) {
			System.out.println("Reference equal");
		}
		else {
			System.out.println("Reference not equal");
		}
		System.out.println("================");
		
		
			
			
		
			
			
			
		}

}


