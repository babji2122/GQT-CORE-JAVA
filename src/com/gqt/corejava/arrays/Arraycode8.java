package com.gqt.corejava.arrays;

import java.util.Scanner;

class Educationoperations{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	long medicine_fee;
	long engineering_fee;
	long degree_fee;
	long total_fee=0;
	void creatArray() {
		System.out.println("Enter college count : ");
		int sh=sc.nextInt();
		arr=new String[sh][][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter count of class inside college "+(i+1));
			arr[i]=new String[sc.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of student inside class "+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}
		
		System.out.println("Array is created");
		System.out.println("------------");
		System.out.println("Enter fee for medicine_fee:");
		medicine_fee=sc.nextLong();
		System.out.println("Enter engineering fee:");
		engineering_fee=sc.nextLong();
		System.out.println("Enter fee for degree:");
		degree_fee=sc.nextLong();
	} 
	
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the student name of :"+(k+1));
					arr[i][j][k]=sc.next();
					// counting the number of student in the medicine 
					if(i==0) {
						total_fee+=medicine_fee;
					}
					// counting the number of student in the engineering 
					else if(i==1) {
						total_fee+=engineering_fee;
					}
					// counting the number of student in the degree 
					else {
						total_fee+=degree_fee;
					}
				}
			}
		}
		System.out.println("Data collected");
		System.out.println("------------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Name student in college "+(i+1)+" in class "+(j+1)+" = " +arr[i][j][k]);
				}
			}
		}
		System.out.println("Total free"+total_fee);

	}
	
}


public class Arraycode8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Educationoperations  Eo = new Educationoperations();
		Eo.creatArray();
		Eo.collectData();
		Eo.displayData();
	}
}
             


