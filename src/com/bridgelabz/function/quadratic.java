package com.bridgelabz.function;

import java.util.Scanner;

public class quadratic {
	public static void main(String[] args) {
	       
	       try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter a number1:");
				int a = sc.nextInt();
				System.out.println("enter a number2:");
				int b = sc.nextInt();
				System.out.println("enter a number3:");
				int c = sc.nextInt();
			 double delta = (b * b -4 *a * c);
			 double root1 = (-b + Math.sqrt(delta))/(2*a);
			 double root2 = (-b - Math.sqrt(delta))/(2*a);
			 
				System.out.println("Root1 of x is:" + root1);
				System.out.println("Root2 of x is:" + root2);
	       }			
}
}
