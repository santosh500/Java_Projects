/* -----------------------------------------------------------------------------
 *
 * File Name:  ConvertTemperature.java
 * Author: Paul Charles / santosh@ku.edu
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: date the program was last modified
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class ConvertTemperature {
	
	
	
		
		public static void main(String[] args)
		{
			double temp_celsius;
			double temp_farenheit;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the temperature in Fahrenheit:");
			temp_farenheit = input.nextDouble();
			temp_celsius = (temp_farenheit-32)*(.5555555555);
			System.out.println(temp_farenheit  + " degrees Farenheit = " + temp_celsius + " degrees Celsius.");
			
		}

	


}
