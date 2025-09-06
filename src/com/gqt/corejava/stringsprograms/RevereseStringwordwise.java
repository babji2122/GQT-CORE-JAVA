package com.gqt.corejava.stringsprograms;

import java.util.Scanner;

public class RevereseStringwordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		//step:1 - counting spaces
		int spc_count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='') {
				spc_count++;
			}
		}
		
		//step:2 find the word count
		int word_count=spc_count+1;
		
		//step:3 creat array based on word count
		String arr[]=new string[word_count];
		
		//step:4 traverse
				
			}
		}

	}

}
