package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike harley = new MotorBike();

		ducati.start();
		honda.start();

		// ducati.setSpeed(100);
		ducati.increaseSoeed(100);
		ducati.decreaseSpeed(50);
		System.out.println(ducati.getSpeed());

		// honda.setSpeed(60);
		honda.increaseSoeed(100);
		honda.decreaseSpeed(30);
		System.out.println(honda.getSpeed());

		System.out.println(harley.getSpeed());

	}
};