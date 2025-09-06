package com.gqt.corejava.polymorphism;
class plane1{
	void takeOff() {
		System.out.println("Plane take Off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane1 extends plane{
	@Override
	void fly() {
		System.out.println("cragoPlane flys in low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class Airport{
	void permit(plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class Example3 {

	public static void main(String[] args) {
		//plane p=new plane();
		CargoPlane cp=new CargoPlane();
		PassengerPalne pp=new PassengerPalne();
		FighterPlane fp=new FighterPlane();
		Airport ap = new Airport();
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("-------------------------------------");
		ap.permit(fp);
		pp.carryHumans();
		System.out.println("-------------------------------------");
		ap.permit(fp);
		fp.carryWeapons();
	}

}

