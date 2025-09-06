package com.gqt.corejava.Arrayprograms;

public class LeadersArray {

	public static void main(String[] args) {
		int[] array= {16,17,4,3,5,2};
		int maxRight=array[array.length-1];
		System.out.print("leaders in array:"+array[array.length-1]+"");
		for(int i=array.length-2;i>=0;i--)
		{
			if(array[i]>maxRight) {
				maxRight=array[i];
				System.out.print(array[i]+"");
				
			}
			
		}
		// TODO Auto-generated method stub

	}

}
