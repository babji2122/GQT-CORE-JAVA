package com.gqt.corejava.Arrayprograms;
public class ElementPresent {
public static void main(String[] args) {

int[] array = {1, 2, 3, 4, 5};
int searchElement = 3;

boolean found = false;

	for (int value: array) { 
		if (value == searchElement) { 
			found = true;
			break;
			}
		}
	//comment

if (found) {
	System.out.println(searchElement + " is present in the array.");
}else {

	System.out.println(searchElement + " is not present in the array.");

}
}
}