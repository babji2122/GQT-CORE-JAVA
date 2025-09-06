package com.gqt.corejava.Abstraction;


abstract class Test{
	void land() {
		System.out.println("Plane Lands");
		
	}
}
abstract class plane1{
	abstract void takeOff();
	void takeoff() {
		// TODO Auto-generated method stub
		
	}
	abstract void fly();	
	void land() {
		System.out.println("Plane lands");
	}
}
 class CargoPlane1 extends plane1{
	@Override
	void takeoff() {
		System.out.println("cargoplane require a long runway to takeoff");
		
	}
	@Override
	void fly() {
		System.out.println("cragoPlane flys in low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
	
	class PassengerPalne extends plane1{
	@Override
	void takeOff() {
		System.out.println("cargoplane require a medium runway to takeoff");
	}
	@Override
	void fly() {
		System.out.println("cragoPlane flys in medium heights");
	}
	void carryHumans() {
		System.out.println("Passenger plane carry Humans");
	}
	class FighterPlane extends plane1{
	
		@Override
		void takeOff() {
			System.out.println("cargoplane require a short runway to takeoff");
		}
		@Override
		void fly() {
			System.out.println("cragoPlane flys in medium heights");
		}
		void carryWeapons() {
			System.out.println("Fighter plane carry weapons");
		}
		
		
class Airport{
	void permit(plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class Example1 {

	public static void main(String[] args) {
		//plane p=new plane();
		CargoPlane1 cp=new CargoPlane1();
		PassengerPalne pp=new PassengerPalne();
		FighterPlane fp=new FighterPlane();
		Airport ap = new Airport();
		
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("-------------------------------------");
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("-------------------------------------");
		ap.permit(fp);
		fp.carryWeapons();
		System.out.println("-------------------------------------");
		
		// plane p = new plane ();
		
		plane1 p1 = new plane();
		@Override
		void takeoff() {
			System.out.println("takeoff");
		}
		@Override
		void fly() {
			System.out.println("fly");
		}
		
		p1.takeoff();
		p1.fly();
		p1.land();
		
		Test t1 = new Test() {};
	}

			
	
		
		
		




	