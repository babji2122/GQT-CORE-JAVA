package com.gqt.corejava.arrays;
import java.util.Scanner;
class Arrayoperations2
{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createArray()
	{
		System.out.println("Enter the school count");
		int sch =sc.nextInt();
		System.out.println("Enter the class count in each school");
		int cls =sc.nextInt();
		System.out.println("Enter the student count in each class");
		int stu =sc.nextInt();
		//creating 3D Array
		arr =new String[sch][cls][stu];
		System.out.println("Array created");
		System.out.println("-----------");
	}
	void collectData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside school no:"+(i+1));
			for(int j=0;i<arr.length;j++)
			{
				System.out.println("Inside class no:"+(j+1));
      			for(int k=0;k<arr[i][j].length;k++) 
      			{
      				System.out.println("The name of the student no:"+(k+1));
      			    arr[i][j][k] = sc.next();
      			}
      		}
  		}
      	System.out.println("Data collected");
      }
      void displayData()
  	{
  		for(int i=0; i<arr.length;i++)
  		{
  			System.out.println("Inside school no:"+(i+1));
  			for(int j=0; j<arr[i].length;j++)
  			{
  				System.out.println("Inside the class no:"+(j+1));
  				for(int k=0;k<arr[i][j].length;k++) 
  				{
  					System.out.println("The name of the student no:"+(k+1));
  					System.out.println("Enter the name of the student no:"+(k+1)+ "is ="+arr[i][j][k]);
  				}
  			}
  		}
  		System.out.println("---------");
  		sc.close();
  	}
}


public class ArrayCode5 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Arrayoperations2 al = new Arrayoperations2();
al.createArray();
al.collectData();
al.displayData();
}
	
  				}

			