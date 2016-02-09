/* -----------------------------------------------------------------------------
 *
 * File Name: ComputeCircleArea.java
 * Author: Paul Charles / santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will compute the area of the circle, where the radius is received
 *                      from the user.
 * Date: 02-02-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class ComputeCircleArea {
	
	public static void main(String[] args)
	{
		final double PI = 3.141592;
		double radius;
		double area;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number for radius");
		radius=input.nextDouble();
		area=PI*radius*radius;
		System.out.println("area =" + area);
		
		
	}


}
