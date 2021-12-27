package com.bridgelabz.function;

import java.util.Scanner;

public class windchill {

	public static void main(String[] args) {
	       
	       try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter a number1:");
				double t = sc.nextDouble();
				System.out.println("enter a number2:");
				double v = sc.nextDouble();
				
				double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16);
				System.out.println("Tempreature in Fahrenheit " + t);
				System.out.println("wind speed in miles per hour " + v);
				System.out.println("wind chill "+ w);

	       }
    
	}
}	