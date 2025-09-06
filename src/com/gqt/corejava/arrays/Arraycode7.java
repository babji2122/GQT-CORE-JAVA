package com.gqt.corejava.arrays;

import java.util.Scanner;
class movieoperations
{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc = new Scanner(System.in);
	
	void createArray()
	{
		System.out.println("Enter language count:");
		int lan = sc.nextInt();
		System.out.println("Enter categeory count in each language:");
		int cat = sc.nextInt();
		System.out.println("Enter movie count in each categeory:");
		int mov = sc.nextInt();
		
		// CREATING THE 3D ARRAY 
		
		arr = new long[lan][cat][mov];
		System.out.println("Array created:");
		System.out.println("---------");
		
		System.out. println("Enter the investment made:");
		investment = sc.nextLong();
		System.out. println("Enter the profit made in the finacial year 2023-2024:");
		prev_profit= sc.nextLong();
		
		System.out.println("---------");
	}
		
		
	void collectRevenueData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside language no:"+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Inside categeory no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(" Enter The revenue of movie no :"+(k+1));
					arr[i][j][k] = sc.nextLong();
				}
			}
		}
		System.out.println("Data Collected & calculated");
		System.out.println("---------");
	}
	void displayData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside language no:"+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Inside categeory no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no :"+(k+1));
					System.out.println(" the movie of  no:"+(k+1)+ "is ="+arr[i][j][k]);
				}
		
			}
		}
		System.out.println("---------");
		System.out.println("overal revenue:"+sum_revenue);
		System.out.println("---------");
		if(sum_revenue>investment) {
			Long profit =(sum_revenue-investment);
			System.out.println("the profit made by Hemanth is ="+profit);
			if(profit>prev_profit) {
				System.out.println("Hemanth Has made more profit than previous year");
			}
			
		}
		else {
			System.out.println("the loss incured by Hemanth is ="+(investment-sum_revenue));
		}
		
		
		sc.close();
	}
}
public class Arraycode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movieoperations  mo = new movieoperations();
		mo.createArray();
		mo.collectRevenueData();
		mo.displayData();
	}
}


