package com.gqt.corejava.Collections;

import java.util.ArrayList;

public class ArrayListcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al = new ArrayList();
//inserting data

al.add(100);
al.add(50);
al.add(150);
al.add(25);
al.add(125);
al.add(75);
al.add(175);
System.out.println(al);
al.add("sachin");
al.add(567.67f);
al.add('d');
al.add(true);
System.out.println(al);
al.add(2,1111);
	}

}

