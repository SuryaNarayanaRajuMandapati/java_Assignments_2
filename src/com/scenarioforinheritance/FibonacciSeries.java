package com.scenarioforinheritance;
import java.util.Scanner;

public class FibonacciSeries {
	public static void fibonacciSeries(int n) {
		int a = 0;
		int b = 1;
		
		System.out.print(a+" "+b);
		for(int i=2; i<n; i++) {
			int next = a + b;
			System.out.print(" "+next);
			a = b;
			b = next;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print Fibonacci Series: ");
		int n = sc.nextInt();
		fibonacciSeries(n);
	}
}
