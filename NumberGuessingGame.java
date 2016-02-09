/* -----------------------------------------------------------------------------
 *
 * File Name: NumberGuessingGame.java
 * Author: Paul Charles and santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This is a number guessing game.
 * Date: 02-23-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the number guessing game");
		
		int i;
		System.out.println("Guess a number: ");
		i = kb.nextInt();
		
		do{
		
		if (i > 73)
		{
			do
			{
				System.out.println("Sorry, your guess is too high");
				System.out.println("Guess a number");
				i = kb.nextInt();
				
				
			}while(i>73);
	
		}
		else
		{
			do
			{
				System.out.println("Sorry, your guess is too low.");
				System.out.println("Guess a number");
				i = kb.nextInt();
			}while(i<73);
			
		}
				
			
		}while(i!=73);
		
		System.out.println("You win");
		
		
	
		
		
		
		
	}
}