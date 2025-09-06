package com.gqt.corejava.Arrayprograms;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][]matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			sum+=matrix[i][i];
		}
		System.out.println("sum of diagonal elements in the 2D array:"+sum);
		
		// TODO Auto-generated method stub

	}

}
