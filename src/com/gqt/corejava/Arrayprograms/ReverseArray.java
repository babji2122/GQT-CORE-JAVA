package com.gqt.corejava.Arrayprograms;

	public class ReverseArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] array = {1,2,3,4,5};
			int length = array.length;
			for(int i=0;i<length/2;i++) {
				int temp = array[i];
				array[i]=array[length-1-i];
				array[length-1-i]=temp;
			}
			System.out.println("Reversed array:");
			for(int i=0;i<length;i++) {
				System.out.println(array[i]+"");
			}
		}
	}
