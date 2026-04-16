package com.scenarioforinheritance;
import java.util.Scanner;

public class CheckPrime {
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		
		for(int i=2; i<=Math.pow(number, 0.5); i++) {
			if(number%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		if(isPrime(number)) {
			System.out.println(number+" is a Prime Number");
		}
		else {
			System.out.println(number+" is not a Prime Number");
		}
		sc.close();
	}
}
