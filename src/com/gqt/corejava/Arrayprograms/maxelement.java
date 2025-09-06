package com.gqt.corejava.Arrayprograms;
public class maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = {5,2,8,1,6};
        int max = array[0];
        for (int i = 1;i<array.length;i++) {
        	if(array[i]>max) {
        		max = array[i];
        	}
     }
        System.out.println("Maximum element in the array:"+max);
	}
}

