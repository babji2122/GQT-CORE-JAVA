package com.gqt.corejava.exceptionHandling;


import java.util.Scanner;

class Operation1{
	void function1() throws Exception{
		System.out.println("Inside fuction-1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Division  Operator");
		System.out.println("Enter the First number :");
		int n1 = sc.nextInt(); //critical statement ---- InputMismatchException
		System.out.println("Enter the Second number :");
		int n2 = sc.nextInt(); //critical statement ---- InputMismatchException
		int res = n1 / n2; //critical statement -- Arithmetic Exception
		System.out.println(res);
		System.out.println("Outside fuction-1");
	}
}
class Operation2{
	void function2() throws Exception{
		System.out.println("Inside fuction-2");
		Operation1 op1 = new Operation1();
		op1.function1();
		System.out.println("Outside fuction-2");
	}
}

class Operation3 {
	void function3() throws Exception{
		System.out.println("Inside fuction-3");
		Operation2 op2 = new Operation2();
		try
		{
			op2.function2();
		}
		catch (Exception e)
		{
			System.out.println("Exception handled in function-3");
			throw e;
		}
		System.out.println("Outside fuction-3");
	
	}
}
public class Launch9 {

	public static void main(String[] args) {
		System.out.println("Inside Main fuction");
		Operation3 op3 = new Operation3();
		
		try {
			op3.function3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Outside Main fuction");
	}

}

