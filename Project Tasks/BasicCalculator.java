package com.tasks.is.codetechit;

import java.util.Scanner;

public class BasicCalculator {
 public static void main (String[] args)
 {
	 Scanner scanner = new Scanner(System.in);
	 
	 while(true)
	 {
		 try {
			 System.out.println("Enter First number= ");
			 
			 double num1 = scanner.nextDouble();
			 System.out.println("Enter the Operation(+,-,*,/):");
			 
			 char operation = scanner.next().charAt(0);
			 System.out.println("Enter Second number=");
			 
			 double num2 = scanner.nextDouble();
			 
			 double result = 0.0;
			 
			 switch(operation)
			 {
			 case'+':
				 result = add(num1,num2);
				 break;
			 case'-':
			    result = subtract(num1,num2);
			    break;
			 case'*':
				 result = multiply(num1,num2);
				 break;
			 case'/':
				 result = divide(num1,num2);
				 break;
			 default:
				 System.out.println("Invalid operation.Please enter +,-,*,or /.");
				 continue;
			
			  }
			 System.out.println("Result:" + result);
		 }
		 catch(Exception e) {
			 System.out.println("Invalid input.Please enter valid numbers.");
			 scanner.nextLine();	 
	 }
 }
}
 private static double add(double x,double y)
 {
	 return x+y;
 }
 private static double subtract(double x,double y)
 {
	 return x-y;
 }
 private static double multiply(double x,double y)
 {
	return x*y;
 }
 private static double divide(double x,double y)
 {
	 if(y != 0) {
		 return x/y;
	 }else {
		 System.out.println("Cannot divide by zero");
		 return Double.NaN;
	 }
		 
	 }
}
 