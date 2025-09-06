package com.gqt.corejava.interfaceprograms;


//point - 4, 14, 15, 19, 20, 21
interface Calculator1 {
	int a=100; // public static final int a = 100;
	void add();// public abstract void add();
	void add1();// public abstract void add();
	void add2();// public abstract void add();
	void add3();// public abstract void add();
	
	default void sub() {
		System.out.println("Inside sub method");
	}
	default void sub1() {
		System.out.println("Inside sub1 method");
	}
	default void sub2() {
		System.out.println("Inside sub2 method");
	}
	default void sub3() {
		System.out.println("Inside sub3 method");
	}
	
	static void mul() {
		System.out.println("Inside mul method");
	}
	static void mul1() {
		System.out.println("Inside mul1 method");
	}
	static void mul2() {
		System.out.println("Inside mul2 method");
	}
	static void mul3() {
		System.out.println("Inside mul3 method");
	}
}
//point - 1, 2, 3, 5
class SampleCalcy implements Calculator1{
	@Override
	public void add() {
		// TODO Auto-generated method stub
	}
	@Override
	public void add1() {
		// TODO Auto-generated method stub
	}
	@Override
	public void add2() {
		// TODO Auto-generated method stub
	}
	@Override
	public void add3() {
		// TODO Auto-generated method stub
	}
	
}


//point - 9, 10
interface Calculator2{
	public Calculator2() {
		//cannot create a constructor for an interface
	}
}
//point - 12
interface Calculator3 implements Calculator1{
	
}
//point - 13
interface Calculator4 extends Calculator1{
	
}
interface Calculator5{
	void div();
	void mul();
}
interface Calculator6{
	void sub();
}
//point - 11
class SampleCalcy2 implements Calculator5,Calculator6{

	@Override
	public void sub() {
		// TODO Auto-generated method stub
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
	}
	
}
//point - 14
abstract class SampleCalcy3 implements Calculator5{
	@Override
	public void div() {
		// TODO Auto-generated method stub
	}
}
//point - 17
interface Calculator7{
	//empty interface
}

class Calculator8{
	void disp() {
		System.out.println("Hello");
	}
}
interface Calculator9{
	void sub();
}
//point-18,5
class SampleCalcy4 extends Calculator8 implements Calculator9{
	@Override
	public void sub() {
		// TODO Auto-generated method stub
	}
}

public class Example1 {
	public static void main(String[] args) {
		Calculator1 c1; //reference of interface (point-7)
		//point-6
		Calculator1 c2 = new Calculator1(); //cannot create object of interface directly
		//point-8
		Calculator1 c3 = new Calculator1() {
			@Override
			public void add3() {
				// TODO Auto-generated method stub
			}
			@Override
			public void add2() {
				// TODO Auto-generated method stub
			}
			@Override
			public void add1() {
				// TODO Auto-generated method stub
			}
			@Override
			public void add() {
				// TODO Auto-generated method stub
			}
		};
	}
}





