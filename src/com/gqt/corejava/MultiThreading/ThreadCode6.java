package com.gqt.corejava.MultiThreading;

class MicrosoftWord extends Thread{
	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("typing")) {
		    typing();	
		}
		else if (Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
		}
	}
// primary
	private void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("typing in Progress");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		   }
		}
// secondary
	private void checking() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Checking in Progress");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		   }
		
	}

	private void saving() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("saving in Progress");
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		   }
	}
}
public class ThreadCode6 {

	public static void main(String[] args) {
		MicrosoftWord ms1 = new MicrosoftWord();
		ms1.setName("typing");
		MicrosoftWord ms2 = new MicrosoftWord();
		ms2.setName("checking");
		ms2.setPriority(8);
		ms2.setDaemon(true);
		MicrosoftWord ms3 = new MicrosoftWord();
		ms3.setName("saving");
		ms2.setPriority(9);
		ms2.setDaemon(true);
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
