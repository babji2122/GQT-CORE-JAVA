package com.gqt.corejava.Arrayprograms;

	public class CheckSorted {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] array = {1,2,3,4,5};
			boolean sorted = true;
			for(int i=1;i<array.length;i++) {
				if(array[i]<array[i-1]) {
					sorted=false;
					break;
				}
			}
			if(sorted) {
				System.out.println("The array is sorted in ascending order.");
			}else {
				System.out.println("The array is not sorted in ascending order.");
			}
		}
	}
