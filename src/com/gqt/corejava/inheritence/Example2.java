package com.gqt.corejava.inheritence;

class plane{
	void tookOff() {
		System.out.println("Plane took Off");
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

public class Example2 {

	public static void main(String[] args) {
		plane p=new plane();
		CargoPlane cp=new CargoPlane();
		PassengerPalne pp=new PassengerPalne();
		FighterPlane fp=new FighterPlane();
		cp.tookOff();
		cp.fly();
		cp.carryGoods();
		cp.land();
		System.out.println("-------------------------------------");
		pp.tookOff();
		pp.fly();
		pp.carryHumans();
		pp.land();
		System.out.println("-------------------------------------");
		fp.tookOff();
		fp.carryWeapons();
		fp.fly();
		fp.land();
	}

}
				


