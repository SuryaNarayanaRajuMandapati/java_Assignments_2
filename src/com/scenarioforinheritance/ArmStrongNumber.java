package com.scenarioforinheritance;
import java.util.Scanner;

public class ArmStrongNumber {
	public static boolean isArmStrongNumber(int number) {
		int length = (number+"").length();
		int sum = 0;
		int n = number;
		while(n > 0) {
			sum += Math.pow(n%10, length);
			n /= 10;
		}
		return sum == number;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(isArmStrongNumber(number)) {
			System.out.println(number+" is a ArmStrong Number");
		}
		else {
			System.out.println(number+" is not a ArmStrong Number");
		}
		sc.close();
	}
}
