package com.gqt.corejava.Encapsulation;
class Dog2{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}

	
public class Example4 {

	public static void main (String args[]) {
		Dog2 d = new Dog2();
		d.setName("jimmy");
		d.setColor("pink");
		d.setBreed("pug");
		d.setAge(9);
		d.setCost(7000);
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getBreed());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
	}

}
