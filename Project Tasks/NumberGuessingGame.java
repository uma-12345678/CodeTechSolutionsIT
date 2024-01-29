package com.tasks.is.codetechit;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int secretNumber = rand.nextInt(100)+1;
		int attemptsLeft = 5;
		
		System.out.println("Welcome to the Number Guessing Game...");
		System.out.println("Please enter your guess=");
		
		int userInput = scanner.nextInt();
		
		while(attemptsLeft>0 && userInput != secretNumber)
		{
			if(userInput < secretNumber)
			{
				System.out.println("Too low! Please try again..");
			}
			else
			{
				System.out.println("Too high! Please try again..");
			}
			System.out.println("Enter your next Guess=");
			userInput = scanner.nextInt();
			attemptsLeft--;
		}
        if(userInput == secretNumber)
        {
        	System.out.println("Congratulations! You Guessed the correct number in" + (5-attemptsLeft)+"attempts.");
        }
        else {
        	System.out.println("Sorry,you have used all your attempts.The correct answer was"+ secretNumber+".");
        }
        scanner.close();
	}

}
