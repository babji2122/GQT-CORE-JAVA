package com.gqt.corejava.Arrayprograms;
public class BubbleSort {

public static void main(String[] args) {

int[] array = {5, 2, 8, 1, 6} ;

int n=array.length;

for (int i = 0; i < n - 1 ;i++) {

for (int j = 0 ; j < n - 1 - i ;j ++) {
	if (array[j]> array[j + 1]) {
		int temp=array[j];
		array[j] = array[j + 1];
		array[j+1] = temp;
	}
}

}

System.out.print("Sorted array using bubble sort: ");

for (int value: array) {

System.out.print(value + " ");

}

}

}