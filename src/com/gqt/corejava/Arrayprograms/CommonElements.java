package com.gqt.corejava.Arrayprograms;
import java.util.HashSet; 
import java.util.Set;

public class CommonElements {
public static void main(String[] args) {
	
int[] array1 = {1,2,3,4,5};
int[] array2 = {14, 5, 6, 7, 8};

Set<Integer> set1= new HashSet<>();
 for(int value: array1) {
	 set1.add(value);
 }
Set<Integer> commonSet = new HashSet<>();
for(int value : array2)
{
	if(set1.contains(value)) {
		commonSet.add(value);
	}
}
System.out.print("Common elements between arrays: "+commonSet);
}
}