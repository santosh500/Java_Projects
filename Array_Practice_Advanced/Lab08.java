/* -----------------------------------------------------------------------------
 *
 * File Name:  Lab08.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 8
 * Description:  This program deals with finding statistics regarding 2D arrays.
 * Date: 04-06-15
 *
 ---------------------------------------------------------------------------- */

package lab08;
import java.util.Scanner;
public class Lab08 {
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		ArrayHelper trans = new ArrayHelper();
		System.out.print("How many rows of the array: ");
		int rows=kb.nextInt();
		System.out.print("How many columns of the array: ");
		int columns=kb.nextInt();
		int[][] array=new int[rows][columns];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print("Enter a value for position (" + i +"," + j +"):");
				int v=kb.nextInt();
				array[i][j]=v;
			}
		}
		System.out.println("Here is your array");
		trans.print2DArray(array);
		
		
		for(int i=0; i< rows; i++)
		{

			System.out.println("row " + i + " sum= " + trans.arraySum(array[i])+" avg= " + trans.arrayAvg(array[i]));
		}
		System.out.println("The largest value in the array is = " + trans.arrayMax2D(array));
		System.out.println("The sum for the entire array is = " + trans.arraySum2D(array));
		System.out.println("The average for the entire array is = " + trans.arrayAvg2D(array));
		
		
				
	}

}