package com.in28minutes.oops.level2;

public class Rectangle {

	// states
	private int length;
	private int width;

	// creation of the constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// Operations
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return this.length * this.width;
	}

	public int perimeter() {
		return 2 * (this.length + this.width);
	}

	@Override
	public String toString() {
		return String.format("Length - %d, Width - %d, Area - %d, Perimeter - %d", this.length, this.width, area(),
				perimeter());
	}

}
