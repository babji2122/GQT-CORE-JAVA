package com.gqt.corejava.arrays;
import java.util.Scanner;
class Arrayoperations1
{
	 String arr[][];
       Scanner sc=new Scanner(System.in);
       void createArray() 
       {
       	System.out.println("Enter the class count");
       	int cls =sc.nextInt();
       	arr = new String[cls][];
       	for (int i=0;i<arr.length;i++)
       	{
       	System.out.println("Enter the count of students inside the class:"+(i+1));
       	arr[i] =new String[sc.nextInt()];
       	}
       	System.out.println("Array created");
       	System.out.println("-------");
       }
       void collectData() {
       	for (int i =0;i<arr.length;i++)
   		{
       		System.out.println("Inside class no:"+(i+1));
       		for(int j =0;j<arr[i].length;j++){
       			System.out.println("The name of student no::"+(j+1));
       			arr[i][j] =sc.next();
       		}
   		}
       	System.out.println("Data collected");
       }
	        void displayData()
	    	{
	    		for(int i=0; i<arr.length;i++)
	    		{
	    			System.out.println("Inside class no:"+(i+1));
	    			for(int j=0; j<arr[i].length;j++)
	    			{
	    				System.out.println("Enter the name of student no:"+(j+1)+ "is ="+arr[i][j]);
	    			}
	    		}
	    		System.out.println("---------");
	    		sc.close();
	    	}
	}


public class ArrayCode4 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Arrayoperations1 al = new Arrayoperations1();
	al.createArray();
	al.collectData();
	al.displayData();
}
}
