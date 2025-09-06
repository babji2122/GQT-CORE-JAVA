package com.gqt.corejava.Arrayprograms;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
public static void main(String[] args) {

int[] array = {1, 2, 3, 2, 4, 1, 5, 1};

Map<Integer, Integer> frequencyMap = new HashMap<>();

for (int value: array) {

frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
}
System.out.println("Frequency of each element in the array:");

for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
	System.out.println(entry.getKey()+":"+entry.getValue() + "times");
}
}
}