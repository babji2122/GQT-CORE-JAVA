package com.gqt.corejava.arrays;
import java.util.Scanner;
class Arrayoperations3
{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray()
	{
		System.out.println("Enter the school count:");
		int sch = sc.nextInt();
		System.out.println("Enter the class count in each school:");
		int cls = sc.nextInt();
		System.out.println("Enter student count in each class:");
		int stu = sc.nextInt();
		
		// CREATING THE 3D ARRAY 
		
		arr = new String[sch][cls][stu];
		System.out.println("Array created:");
		System.out.println("---------");
	}
	void collectData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside the school no:"+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Inside the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("The name of student no :"+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Data Collected");
	}
	void displayData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside school no:"+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Inside the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no :"+(k+1));
					System.out.println("Enter the name of student no:"+(k+1)+ "is ="+arr[i][j][k]);
				}
		
			}
		}
		System.out.println("---------");
		sc.close();
	}
}
public class ArrayCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayoperations3  ao = new Arrayoperations3();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
}
                	