package com.gqt.corejava.Arrayprograms;
import java.util.Arrays;

public class ThirdSmallestElement {
public static void main(String[] args) {


int[]array= {5, 2, 8, 1, 6};
Arrays.sort(array);
if (array.length <3) {
System.out.println("Array doesn't have a third smallest element.");
} else { 
	System.out.println("Third smallest element in the array: " + array[2]);
}
}
}