package com.in28minutes.oops.level2;

public class Fan {

	// states
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private int speed;

	// creation
	public Fan(String make, double radius, String color) {

		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		this.speed = 5;
	}

	public void switchOff() {
		this.isOn = false;
		this.speed = 0;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// to print the values of class
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f , color - %s, isOn - %b, speed - %d ", make, radius, color, isOn,
				speed);
		// String.format allows us not to use concatenation

	}

}
