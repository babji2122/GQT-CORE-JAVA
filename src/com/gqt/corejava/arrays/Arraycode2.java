package com.gqt.corejava.arrays;
import java.util.Scanner;
class ArrayOperations
{
	int arr[];
	Scanner sc = new Scanner(System.in);
	void createArray()
	{
		System.out.println("Enter the count:");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Array created:");
		System.out.println("---------");
	}
	void collectData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the marks of student no:"+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Data stored into the array:");
	}
	void displayData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("The marks of student no:"+(i+1)+" is ="+arr[i]);
		}
		sc.close();
	}
}

public class Arraycode2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations ao = new ArrayOperations();
		ao. createArray();
		ao.collectData();
		ao.displayData();

	}

}

