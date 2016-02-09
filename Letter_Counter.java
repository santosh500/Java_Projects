/* -----------------------------------------------------------------------------
 *
 * File Name:  Letter_Counter.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 10
 * Description:  This program serves is used to count the number of alphabets (capital and noncapital) in a text file.
 * Date: 04-21-15
 *
 ---------------------------------------------------------------------------- */
package lab10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Letter_Counter {
	
	public static void main(String[] args) 
	{
		String filename;
		String outputname;
		Scanner kb=new Scanner(System.in);
		while(true)
		{
		System.out.println("Please enter a filename: ");
		filename=kb.nextLine();
		FileReader myFileReader = null;
		BufferedReader myBufferedReader = null;
		char[] r=new char[26];
		int[] b=new int[26];
		for(int i=0; i<26; i++)
		{
			b[i]=0;
		}
		char[] s=new char[26];
		int[] g=new int[26];
		for(int i=0;i<26;i++)
		{
			g[i]=0;
		}
		try
		{	//This try is used to read each line and perform operations on those lines.		
			myFileReader= new FileReader(filename);
			myBufferedReader= new BufferedReader(myFileReader);
			String line;
			line=myBufferedReader.readLine();
			
			while(line != null)
			{		//The following takes each letter in the line and counts them for non capital letters
					char[] a = new char[line.length()];
								
					for(char i='a'; i<='z'; i++)
					{	
						r[i-97]=i;
						
						for(char j=0; j<line.length();j++)
						{
							if(i==line.charAt(j))
							{	
								b[i-97]++;
							}
							
						}
						
					}
					
					//The following takes each letter in the line and counts them for each capital letter
					for(char i='A'; i<='Z';i++)
					{
						s[i-65]=i;
						for(char j=0; j<line.length();j++)
						{
							if(i==line.charAt(j))
							{
								g[i-65]++;
							}
						}
					}
					System.out.println(line);
					
				
				
				
				line=myBufferedReader.readLine();
			
			}
			
			myBufferedReader.close();
			
		
		
		try
		{
			//This try is used to write the operations that were done to the filename text and paste them onto a document of user's choice.
			System.out.println("Please enter an output file: ");
			outputname=kb.nextLine();
			FileWriter myFileWriter = new FileWriter(outputname);
			BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
			for(int i=0; i < 26; i++)
			{	
				//This statement writes for non-capital letters
				myFileWriter.write(("\n\r"+r[i]+" = "+b[i]));
			
			}
			for(int i=0; i < 26; i++)
			{		
				//This statement writes for capital letters
				myFileWriter.write(("\n\r"+s[i]+" = "+g[i]));
			
			}
			
			myFileWriter.close();				
			
			
		}
		
		catch (Exception e)
		{	
			//This catch is used to show if there are errors
			System.out.println("Invalid input file" + e.getMessage());
		}
		break;
		}
		catch (Exception e)
		{
			//This catch is used to show if there are errors
			System.err.println("Invalid input");
		}}
		
		
		
	}

}
