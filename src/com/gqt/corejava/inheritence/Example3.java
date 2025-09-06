package com.gqt.corejava.inheritence;

class Animal1{
	void sleep() {
		System.out.println("All animal Sleeps");
	}
	void eat() {
		System.out.println("Animal eats");
	}
	void breed() {
		System.out.println("All animals breeds");
	}
}
class Lion extends Animal1{
	@Override
	void eat() {
		System.out.println("Loin eats meat and carnivorous");
	}
	void nature() {
		System.out.println("Loin is king of Jungle");
	}
}
class Deer extends Animal1{
	@Override
	void eat() {
		System.out.println("Deer eats grass");
		
	}
	void nature() {
		System.out.println("Social animal and prey");
	}
}
class Elephants extends Animal1{
	@Override
	void eat() {
		System.out.println("Elephant eats all vegetation");
	}
	void nature() {
		System.out.println("maker of jungles");
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		Animal1 a1=new Animal1();
		Lion l=new Lion();
		Deer d=new Deer();
		Elephant e=new Elephant();
		l.eat();
		l.sleep();
		l.nature();
		l.breed();
		System.out.println("-------------------------------------");
		d.eat();
		d.sleep();
		d.nature();
		d.breed();
		System.out.println("-------------------------------------");
		e.eat();
		e.sleep();
		e.nature();
		e.breed();
	}

}

  
