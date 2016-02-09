/* -----------------------------------------------------------------------------
 *
 * File Name:  Lab6.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 6
 * Description:  This program deals with creating arrays using user input and giving statistics such as sum, mean, max, and min of the array inputs.
 * Date: 03-23-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class Lab6 {
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num, g;
		int sum=0;
		
		do{
			System.out.println("Input an array size: ");
			num = kb.nextInt();
		}while(num<1);
		
		int[] ar1 = new int[num];
		
		for(int i=0; i<num; i++)
		{
			System.out.println("Input a number into your array: ");
			
			g=kb.nextInt();
			ar1[i]=g;
		}
		
		System.out.println("Here are the numbers in the array: ");
		
		for(int i=0; i < num; i++)
		{				
			System.out.println(ar1[i]);
		}
		
		for(int i=0; i<num;i++)
		{
			sum=sum+ar1[i];
		}
		System.out.println("The sum of the array values are: " + sum);
				
		int mean=(sum/num);
		System.out.println("The average of all the values is: " + mean);
		
		int max=ar1[0];
		for(int i=0; i < num; i++)
		{
			if(ar1[i]>max)
			{
				max=ar1[i];
			}
		}
		System.out.println("The largest value is: " + max);
		
		int min=ar1[0];
		for(int i=0; i < num; i++)
		{
			if(ar1[i]<min)
			{
				min=ar1[i];
			}
		}
		System.out.println("The smallest value is: " + min);
		
		
	}

}