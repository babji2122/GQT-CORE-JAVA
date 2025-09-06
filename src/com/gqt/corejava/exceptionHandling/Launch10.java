package com.gqt.corejava.exceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "the age is less than the minimum age.Application cannot be processes";
	}
	
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "the age is more than the minimum age.Application cannot be processes";
		
	}
}
class Candiate{
	int age;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = sc.nextInt();
	}
void validate throws UnderAgeException,OverAgeException {
	
	
	
	
	
	
	
	
	
}
class Matrimony{
	void Proces(Candiate c) {
		try {
			c.CollectData();
			c.Validate();
		}
		catch(OverAgeException | UnderAgeException e1) {
			try {
				c.CollectData();
				c.Validate();
			}
			catch(OverAgeException | UnderAgeException e2) {
				try {
					c.CollectData();
					c.Validate();
				}
				catch(OverAgeException | UnderAgeException e3) {
					try {
						c.CollectData();
						c.Validate();
					}
					catch(OverAgeException | UnderAgeException e3) {
						System.out.println("Candiate is Blocked");
						System.exit(0);
					}
					
				
			}
		}
			
			
	
public class Launch10 {
	public static void main(String[] args) {
		Candiate c = new Candiate();
		Matrimony m = new Matrimony();
		m.Proces(c);
	}
}


