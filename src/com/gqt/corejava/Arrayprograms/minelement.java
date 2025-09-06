package com.gqt.corejava.Arrayprograms;

	public class minelement {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] array = {5,2,8,1,6};
			int min = array[0];
			for(int i =1;i<array.length;i++) {
				if(array[i]<min) {
					min=array[i];
				}
			}
		  System.out.println("Manimum element in the array:"+min);
		}
	}


