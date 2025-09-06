package com.gqt.corejava.interfaceprograms;

import com.gqt.corejava.interfaceprograms.Heart.Human;

class Brain{
	double weight;
	float iq;
	public Brain(double weight, float iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public double getWeight() {
		return weight;
	}
	public float getIq() {
		return iq;
	}
	
}
class Heart{
	double size;
	int values;
	public Heart(double size, int values) {
		super();
		this.size = size;
		this.values = values;
	}
	public double getSize() {
		return size;
	}
	public int getValues() {
		return values;
	}
	class Human{
		Brain b = new Brain(30,72);
		Heart h = new Heart(50,4);
		}
		
	}
	class Book{
		String name;
		int cost;
		public Book(String name, int cost) {
			super();
			this.name = name;
			this.cost = cost;
		}
		public String getName() {
			return name;
		}
		public int getCost() {
			return cost;
		}
	}
	class Mobile{
		String compamy;
		String name;
		public Mobile(String compamy, String name) {
			super();
			this.compamy = compamy;
			this.name = name;
		}
		public String getCompamy() {
			return compamy;
		}
		public String getName() {
			return name;
		}
		
	}
	class Student extends Human{
		void hasbook(Book b) {
			System.out.println(b.getname);
			System.out.println(b.getcost);
			System.out.println("-----------");
		}
		void hasmobile(Mobile m) {
			System.out.println(m.getcompany);
			System.out.println(m.getname);
			System.out.println("-----------");
			
		}
	}

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Book bk = new Mobile("Apple","Iphone15");
		
		System.out.println(s.bn.getWeight());
		System.out.println(s.bn.getIq());
		System.out.println("-----------");
		System.out.println(s.h.getsize());
		System.out.println(s.h.getvalues());
		System.out.println("-----------");
		s.hasbook(bk);
		s.hasbook(bk);
		
		
		

	}

}
