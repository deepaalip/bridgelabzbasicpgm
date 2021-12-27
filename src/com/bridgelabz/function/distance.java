package com.bridgelabz.function;

import java.util.Scanner;

public class distance {
	public static void main(String[] args) {
	       
	       try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter a number1:");
				int x = sc.nextInt();
				System.out.println("enter a number2:");
				int y = sc.nextInt();
				
				double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
				System.out.println("The Euclidean distance from pt.(0,0) to (x,y) is : " + distance);
       }
	}
}	
	
