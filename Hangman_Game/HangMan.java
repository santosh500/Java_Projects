/* -----------------------------------------------------------------------------
 *
 * File Name:  HangMan.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Homework 3
 * Description:  This class serves as a template that contains logic in which the class GameDriver uses to run a hangman game.
 * Date: 04-19-15
 *
 ---------------------------------------------------------------------------- */

public class HangMan {

	final private String secret_word;
	private char[] disguised_word;
	private int guessCount;
	private int missesCount;
	private int MAX_MISSES_ALLOWED;
	private char[] missedMarkers=new char[7];
	public static int gamesPlayed=0;
	public int maxmiss;
	public int p;
	public String s = " ";
	
	public HangMan(String secword)
	{
		//This method serves as a constructor for the instance variables given above.
		secret_word=secword;
		disguised_word=new char[secret_word.length()];
		for(int i=0; i<secret_word.length(); i++)
		{
			disguised_word[i]='?';
		}
		guessCount=0;
		missesCount=0;
		MAX_MISSES_ALLOWED=7;
		missedMarkers=new char[]{'O','O','O','O','O','O','O'};
		maxmiss=7;
	}
	public boolean guessCharacter(char guess)
	{
		//This method is used to pass the guess and to obtain the disguised word, which is dependent on the length of the secret word.
		//This method is also used to find the guess count, miss count, and display the missedmarkers line.
		boolean returnValue=false;
		int i=0,x=0;
		int w=0;
		p=0;
		for(i=0; i < secret_word.length(); i++)
		{
			if(guess == secret_word.charAt(i))
			{	returnValue= true;
			x=1;
			for(int j=0; j< disguised_word.length; j++)
			{
				disguised_word[i]=guess;
			}
			w=2;
		}
			else
			{
				returnValue = false;
			}
		}
		if(x==1)
		{
			missesCount=missesCount+0;
		}
		else
		{
			missesCount=missesCount+1;
		}
		if(w==2)
		{
		
		}
		else
		{
			int t=MAX_MISSES_ALLOWED-1;
			while(t>MAX_MISSES_ALLOWED-2)
			{
				missedMarkers[t]='X';
				t--;
			}
			MAX_MISSES_ALLOWED--;
		}
		guessCount=guessCount+1;
		return returnValue;
	}
	private String find()
	{
		//This method is used to assist the other methods. Primarily, it is used to help the method isFound() when the word is correctly guessed.
		String q="";
		for(int i=0; i < secret_word.length(); i++)
		{
			q=q+disguised_word[i];
		}
		return(q);
	}
	public boolean isGameOver()
	{
		//This method is used to tally the amount of games played when the game is over.
		//This game is over whenever the max number of guesses is 0 or when the word is correctly guessed.
		if(MAX_MISSES_ALLOWED==0 || isFound() == true)
		{
			gamesPlayed=gamesPlayed+1;
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public boolean isFound()
	{
		//This method is used to determine when the word is found (or when the disguised word is filled).
		if((find()).equals(secret_word))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public String getDisguisedWord()
	{
		//This method is used to get the disguised word and return it.
		return(find());
	}
	public int getGuessCount()
	{
		//This method is used to get the guess count and return it.
		return(guessCount);
	}
	public int getMissesCount()
	{
		//This method is used to get the miss count and return it.
		return(missesCount);
	}

	public char[] getMissedMarker()
	{
		//This method is used to get the missed marker panel and return it.
		return(missedMarkers);
	}
	public int getGamesPlayed()
	{
		//This method is used to get the games played and return it.
		return(gamesPlayed);
	}
	
	
}
	