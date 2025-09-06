package com.gqt.corejava.arrays;


import java.util.Scanner;

class Array2dAddition{
	int arr[][];
	int arr1[][];
	int ans[][];
	Scanner sc=new Scanner(System.in);
	void creatarray() {
		System.out.println("Enter the  Array1 row1 count:");
		int cll=sc.nextInt();
		System.out.println("Enter the  Array1 c1 count:");
		int st=sc.nextInt();
		arr=new int[cll][st];
		System.out.println("Array1 created");
		System.out.println(" -------------------");
		System.out.println("Enter the Array2 r2 count:");
		int cll1=sc.nextInt();
		System.out.println("Enter the Array2 c2 count:");
		int st1=sc.nextInt();
		arr1=new int[cll1][st1];
		System.out.println("Array2 created");
		System.out.println(" -------------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter Array1 the element of r= "+(i+1)+" c = "+(j+1));
				arr[i][j]=sc.nextInt();
				System.out.println(" -------------------");
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter Array2 the element of r= "+(i+1)+" c = "+(j+1));
				arr1[i][j]=sc.nextInt();
				arr[i][j]+=arr1[i][j];
				System.out.println(" -------------------");
			}
		}
		System.out.println("Data collected");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Arraycode9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2dAddition A1=new Array2dAddition();
		A1.creatarray();
		A1.collectData();
		A1.displayData();
	}



	}


