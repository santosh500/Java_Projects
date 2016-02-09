/* -----------------------------------------------------------------------------
 *
 * File Name: Summation.java
 * Author: Paul Charles and santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 4
 * Description:  This program will figure out the sum of the multiples of five from any integer.
 * Date: 02-23-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class Summation {
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input a positive integer as the end value: ");
		int i;
		i = kb.nextInt();
		int n;
		n=i/5;
		int p=5;
		int l=0;
		while(n > 0)
		{   
			
			
			l=l+(p*n);
			
			n=n-1;
			
			
			
			
				
		}
		
			
		System.out.println(l);
		
	}

}