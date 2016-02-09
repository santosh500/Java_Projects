/* -----------------------------------------------------------------------------
 *
 * File Name: WordGuessingGame.java
 * Author: Paul Charles and santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This program is a word guessing game.
 * Date: 02-23-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;


public class WorldGuessingGame {

	
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the word guessing game!");
		System.out.println("Guess a word");
		String s1 = " ";
		s1=kb.nextLine();
		
		while (!s1.equals("valentine"))
		{
			System.out.println("Incorrect. Guess again:");
			s1 = kb.nextLine();
		}
		
		System.out.println("You win!");
	}
}
