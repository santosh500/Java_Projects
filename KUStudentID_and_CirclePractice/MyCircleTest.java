/* -----------------------------------------------------------------------------
 *
 * File Name:  MyCircleTest.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 9
 * Description:  This program deals with obtaining several methods from MyCircle and using them to obtain results. 
 * Date: 04-13-15
 *
 ---------------------------------------------------------------------------- */
package lab9;

import java.util.Scanner;

public class MyCircleTest {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		MyCircle myCircle = new MyCircle();
		myCircle.radius = 5.5;
		System.out.println("My circle has a radius of " + myCircle.radius);
		double theArea;
		double theCircum;
		theArea=myCircle.area();
		theCircum=myCircle.circumference();
		System.out.println("The area is " + theArea);
		System.out.println("The circumference is " + theCircum);
		System.out.println("The diameter is " + myCircle.diameter());
		
		
              
	}

}
