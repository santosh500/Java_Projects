/* -----------------------------------------------------------------------------
 *
 * File Name:  GameDriver.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Homework 3
 * Description:  This class contains the user interface that runs the HangMan class for a hangman game.
 * Date: 04-19-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;

public class GameDriver {

public static void main(String[] args)

{	
	Scanner kb = new Scanner(System.in);
	System.out.println("Welcome to the Hangman Game!");
	System.out.println("----------------------------");
	String secword=" ";
	char guess;
	String v=" ";
	HangMan trans;
	int o=0;
	int g;
	do{
		int q=0;
		System.out.println("Please input a new word: ");
		secword=kb.next();
		trans = new HangMan(secword);
		for(int i=0;i<100;i++)
		{
			System.out.println(" ");
		}
		while( trans.isGameOver()==false)
		{
			System.out.print("Please guess a character: ");
			guess=kb.next().charAt(0);
			trans.guessCharacter(guess);
			System.out.println(trans.getDisguisedWord());
			System.out.println("Guesses: " + trans.getGuessCount());
			System.out.println("Misses: " + trans.getMissesCount());
			System.out.println(trans.getMissedMarker());
		}
		if(trans.getMissesCount()==7)
		{
			System.out.println("You lost");
		}
		else
		{
			System.out.println("You won");
		}
		System.out.println("Would you like to play again: ");
		v=kb.next();
	}while(v.toLowerCase().equals("yes"));
	System.out.println("You have played " + trans.getGamesPlayed() + " game(s) of Hang Man");

}

}