package com.gqt.corejava.Arrayprograms;
public class SeparateEvenOdd {
public static void main(String[] args) {
	
int[] array = {1, 2, 3, 4, 5, 6, 7, 8,9};

System.out.println("Even numbers:"); 
	for (int value: array){
		if (value%2==0) { 
			System.out.print(value + " ");
		}
	}


System.out.println("\nOdd numbers:");
for (int value: array) {

if (value % 2 != 0) {
System.out.print(value +" ");
}
}
}
}