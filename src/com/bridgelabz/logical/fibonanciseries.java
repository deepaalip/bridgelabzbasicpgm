package com.bridgelabz.logical;

public class fibonanciseries {
   public static void main(String[] args) {
	   int number = 10;
	   int previousNum = 0;
	   int currentNum = 1;
	   System.out.println("fibonanci series" + number + "is" + previousNum+  +currentNum);
	   for (int i=0; i<number; i++) {
	      int nextNum = previousNum + currentNum;
	      previousNum = currentNum;
	      currentNum = nextNum;
	      System.out.println(" " +nextNum);
	   }
   }
}
