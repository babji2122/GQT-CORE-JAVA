package com.gqt.corejava.Encapsulation;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(float a,double b) {
		return a+b;
	}
	double add(double a,float b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	double add(int a,double b,float c) {
		return a+b+c;
	}
	double add(double a,int b,float c) {
		return a+b+c;
	}
	double add(float a,int b,double c) {
		return a+b+c;
	}
	double add(int a,float b,double c) {
		return a+b+c;
	}



}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		float m=10.33f,n=20.33f,o=30.33f;
		double p=100.33,q=200.33,r=300.33;
		
		Calculator cl=new Calculator();
		System.out.println(cl.add(a, b));
		System.out.println(cl.add(a,p,m ));
		System.out.println(cl.add(m,b ));
		System.out.println(cl.add(a,n ));
		System.out.println(cl.add(a,m,p));
		System.out.println(cl.add(p,a,o));

	}

}
