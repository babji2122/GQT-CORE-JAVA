package com.gqt.corejava.Encapsulation;
class Dog1{
	private String name;
	private String color;
	private int age;
	private int cost;
	
	void setData(String name,String color,int age,int cost) {
	this.name = name;
	this.color = color;
	this.age = age;
	this.cost = cost;
	}
	void getData() {
		System.out.println("Name ="+name);
		System.out.println("color ="+color);
		System.out.println("Age ="+age);
		System.out.println("Cost ="+cost);
	}
		
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d2 = new Dog1();
		d2.setData("jacky","pink",10,5000);
		d2.getData();

	}

}
