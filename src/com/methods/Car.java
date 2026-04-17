package com.methods;

public class Car {
	String companyName;
	static int noOfWheels = 4;
	int engineNumber;
	boolean isAcPresent;
	boolean isMusicSystemPresent;
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.car1();
		System.out.println();
		obj.car2();
	}
	
	public void car1() {
		Car c1 = new Car();
		c1.companyName = "Benz";
		c1.engineNumber = 123;
		c1.isAcPresent = true;
		c1.isMusicSystemPresent = true;
		
		System.out.println(c1.companyName);
		System.out.println(noOfWheels);
		System.out.println(c1.engineNumber);
		System.out.println(c1.isAcPresent);
		System.out.println(c1.isMusicSystemPresent);
	}
	
	public void car2() {
		Car c2 = new Car();
		c2.companyName = "Audi";
		c2.engineNumber = 321;
		c2.isAcPresent = false;
		c2.isMusicSystemPresent = true;
		
		System.out.println(c2.companyName);
		System.out.println(noOfWheels);
		System.out.println(c2.engineNumber);
		System.out.println(c2.isAcPresent);
		System.out.println(c2.isMusicSystemPresent);
	}
	
}
