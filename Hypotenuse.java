
 /* -----------------------------------------------------------------------------
 *
 * File Name:  Hypotenuse.java
 *  * Author: Paul Charles / santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will compute the value of a hypotenuse from a given a and b sides of a triangle.
 * Date: 02-02-15
 *
 ---------------------------------------------------------------------------- */
import java.lang.Math;
import java.util.Scanner;
public class Hypotenuse {
	
	public static void main (String[] args)
	{
		double a;
		double b;
		double c;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Will use the formula a^2 + b^2 = c^2");
		System.out.print("Input a value for a: ");
		a = input.nextDouble();
		System.out.print("Input a value for b: ");
		b = input.nextDouble();
		c = Math.sqrt(a*a+b*b);
		System.out.println("The hypotenuse is: " + c);
		
		
			
	}




}
