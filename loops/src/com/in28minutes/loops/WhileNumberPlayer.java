package com.in28minutes.loops;

public class WhileNumberPlayer {

	private int limter;
	private int square;

	public WhileNumberPlayer(int limiter) {
		this.limter = limiter;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < this.limter) {
			this.square = i * i;
			System.out.print(this.square + " ");
			i++;

		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < this.limter) {
			System.out.print(i * i * i + " ");
			i++;

		}
	}

}
