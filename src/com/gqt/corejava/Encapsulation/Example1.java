package com.gqt.corejava.Encapsulation;
class Lion1{
	private String name;
	private String color;
	private String country;
	private int age;
	
	
	void setData1() {
		name = "kiran";
		color = "yellow";
		country = "Africa";
		age = 9;
	}
	void setData2(String a,String b, String c,int d) {
		name = a;
		color = b;
		country = c;
		age = d;
	}
	void getData() {
		System.out.println("Name ="+name);
		System.out.println("color ="+color);
		System.out.println("country ="+country);
		System.out.println("age ="+age);
	}
}

public class Example1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion1 l = new Lion1();
		l.setData1();
		l.getData();
		System.out.println("---------");
		l.setData2("Ramu","White","India",14);
		l.getData();
		
	}
}


