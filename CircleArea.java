/* -----------------------------------------------------------------------------
 *
 * File Name: CircleArea.java
 * Author: Paul Charles / santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will compute the area of a circle with a hard-coded radius.
 * Date: 02-02-15
 *
 ---------------------------------------------------------------------------- */
public class CircleArea {
	
	public static void main(String[] args)
	{
		final double PI= 3.141592;
		double radius;
		double area;
		
		radius = 20.0;
		area = PI *radius*radius;
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
		
	}

}
