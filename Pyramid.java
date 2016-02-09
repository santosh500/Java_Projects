/* -----------------------------------------------------------------------------
 *
 * File Name: Pyramid.java
 * Author: Paul Charles and santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This program will create a triangle based on user input.
 * Date: 02-23-15
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner;


public class Pyramid {
	
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		int row;
		int i;
		int j;
		int k;
		System.out.println("Enter the number of asterisks for the base fo the triangle: ");
		row = kb.nextInt();
		
		for ( i = 0; i < row; i++)
		{	
			
			for (j=1; j < (i+1); j=j+1)
			{
				
				System.out.print("*");
			}
			System.out.println("*");
			
		}
		
	}

}
