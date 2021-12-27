package com.bridgelabz.logical;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = sc.nextInt();
		if(number == 0 || number == 1) {
			System.out.println("It is  not a prime number");
		}
		else {
		for (int i=2; i <= number/2; i++) {
			if(number % i == 0)   {
				System.out.println("It is  not a prime number");
				count++;
				break;
		}
		}	
			if(count == 0) {
				System.out.println("It is a prime number");
			}
			
				
		}
		
		
		
		
	}

}
