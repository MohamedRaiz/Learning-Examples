package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	// behavior
	MotorBike() {
		// this.speed = 5; // asign initial value to 5 this way Or
		this(5);// this would call MotorBIke(int speed) function below and the argument is given
				// as 5.
	}

	MotorBike(int speed) { // this is known as constructor. MUST BE THE SAME AS CLASS NAME. this way from
							// the start, can input argument and dont need return.
		this.speed = speed;
	}

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed; // this way, when we passed in an argument in setSpeed, it will be assigned to
								// the private speed in this class.
			// System.out.println(speed); this is based on what is coming in setSpeed
			// System.out.println(this.speed); refers to the speed above under state.
		}
	}

	public void increaseSoeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int reduce) {
		setSpeed(this.speed - reduce);
	}

	int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike Started");
	}
}
