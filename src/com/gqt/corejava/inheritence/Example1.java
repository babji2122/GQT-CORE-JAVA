package com.gqt.corejava.inheritence;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal zero parameterized constructor is invoked");
	}
	public Animal(String message) {
		super();
		System.out.println("Animal zero parameterized constructor is invoked");
		System.out.println("the animal constructor has received the message as :"+message);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("Hello from elephant");
		System.out.println("Hi from elephant constructor");
	}
	public Elephant(String name, double weight) {
		super();
		this.name=name;
		this.weight=weight;
		System.out.println(this.name);
		System.out.println(this.weight);
		
	}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e = new Elephant();
		System.out.println("--------");
		Elephant e1 = new Elephant("Arujuna",5600);
	}
}
}
