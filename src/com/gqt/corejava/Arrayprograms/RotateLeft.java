package com.gqt.corejava.Arrayprograms;

	public class RotateLeft {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] array = {1,2,3,4,5};
			int n = 2;
			int length = array.length;
			for (int i = 0; i<n; i++)
			{
				int first = array[0];
				for(int j = 0; j<length - 1; j++)
				{
					array[j] = array[j + 1];
				}
				array[length -1] = first;
			}
			System.out.print("Array after rotating to the left:");
			for(int value : array)
			{
				System.out.print(value+" ");
			}

		}

	}


