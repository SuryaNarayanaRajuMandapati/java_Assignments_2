package com.constructor;

public class Car {
	private int wheels;
	private String colour;
	private double prize;
	private boolean isAcPresent;
	
	public Car(int wheels, String colour, double prize, boolean isAcPresent) {
		this.wheels = wheels;
		this.colour = colour;
		this.prize = prize;
		this.isAcPresent = isAcPresent;
	}
	
	
	public String toString() {
		return "Car [wheels=" + wheels + ", colour=" + colour + ", prize=" + prize + ", isAcPresent=" + isAcPresent
				+ "]";
	}

	public static void main(String[] args) {
		Car c = new Car(4,"Black",30_000,true);
		System.out.println(c.toString());
	}
	
}
