package com.gqt.corejava.polymorphism;

class plane{
	void takeOff() {
		System.out.println("Plane takeOff");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane extends plane{
	@Override
	void fly() {
		System.out.println("cragoPlane flys in low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPalne extends plane{
	@Override
	void fly() {
		System.out.println("PassergerPlane flys in medium plane");
		
	}
	void carryHumans() {
		System.out.println("Passenger plane carry Humans");
	}
}
class FighterPlane extends plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane flys in great Heights");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		plane p=new plane();
		CargoPlane cp=new CargoPlane();
		PassengerPalne pp=new PassengerPalne();
		FighterPlane fp=new FighterPlane();
		
		plane ref;
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("-------------------------------------");
		
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println("-------------------------------------");
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
	}

}
		

