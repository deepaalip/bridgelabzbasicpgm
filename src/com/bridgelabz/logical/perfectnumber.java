package com.bridgelabz.logical;

import java.util.Scanner;

public class perfectnumber {
public static void main(String[] args) {
	int sumOfDivisors = 0;
	
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter the number: ");  
		int n = sc.nextInt();  
		int i=1; 
		while(i <= n/2)  
		{  
		if(n % i == 0)  
		{  
		
		sumOfDivisors = sumOfDivisors + i;  
		}   
		i++;  
		} 
		if(sumOfDivisors == n)  
		{  
		  
		System.out.println(n+" is a perfect number.");  
		}   
		else  
		 
		System.out.println(n+" is not a perfect number.");
	}   

}
	
	
}
