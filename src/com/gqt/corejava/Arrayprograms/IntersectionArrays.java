package com.gqt.corejava.Arrayprograms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {
  public static void main(String[] args) {
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {4, 5, 6, 7, 8};

Set<Integer> set1 = new HashSet<>();
for (int value: array1) {
set1.add(value);
}

Set<Integer> intersectionSet = new HashSet<>();

for (int value: array2) {
	if(set1.contains(value)) {
		intersectionSet.add(value);

}

}

int[] intersectionArray = new int[intersectionSet.size()];

int index = 0;

for (int value: intersectionSet) {
	intersectionArray[index++] = value;
}
System.out.print("Intersection of arrays: " + Arrays.toString(intersectionArray));
}
}