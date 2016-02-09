/* -----------------------------------------------------------------------------
 *
 * File Name:  ArrayHelper.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 8
 * Description:  This program deals with creating logic in order to demonstrates the use of objects and classes.
 * Date: 04-06-15
 *
 ---------------------------------------------------------------------------- */
package lab08;
import java.util.Scanner;

public class ArrayHelper {


	public static void print2DArray(int[][] array)
	{
		
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length-1; j++)
			{
				System.out.print(array[i][j] + ", ");
			}
			for(int j=array[i].length-1; j< array[i].length; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static int arraySum(int[] array)
	{
			
			int sum=0;
			for(int j=0; j<array.length; j++ )
			{
				int q=array[j];
				sum=sum+q;
			}
			
			return sum;
		
		
		
	}
	public static double arrayAvg(int[] array)
	{
		int columns;
		
		double sum=0;
		for(int i=0; i<array.length; i++ )
		{
			int q=array[i];
			sum=sum+q;
		}
		return(sum/array.length);
	}
	public static int arraySum2D(int[][] array)
	{
		
		int sum=0;
		for(int i=0; i<array.length; i++)
		{	
			for(int j=0; j<array[i].length; j++)
			{
				int v=array[i][j];
				
				sum=sum+v;
			}
			
		}
		return(sum);
		
	}
	public static double arrayAvg2D(int[][] array)
	{
		
		double sum=0;
		int average=0;
		int z=0;;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				int v=array[i][j];
				sum=sum+v;
			}
			z=array[i].length;
		}
		return(sum/(array.length*z));
	}

	public static int arrayMax2D(int[][] array)
	{
		
		int max;
		max=array[0][0];
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				int v=array[i][j];
				if(v>max)
				{
					max=array[i][j];

				}
				
			}
		}
			return(max);
	}

}

