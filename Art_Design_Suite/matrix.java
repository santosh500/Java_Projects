/* -----------------------------------------------------------------------------
 *
 * File Name:  matrix.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Homework 2
 * Description:  This program gives both a square matrix and its transposed form based on user's choice of size.
 * Date: 03-03-15
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner;

public class matrix {

public static void main(String[] args)

{

	Scanner kb = new Scanner(System.in);

	System.out.println("Enter the Size of the Square Matrix:");

	int size=kb.nextInt();

	System.out.println("Square Matrix: ");

	for(int i=1; i <= ((size*size)); i=i+size)

	{

		for(int j=0; j<size; j++)

		{

			System.out.print(j+i);

		}

		System.out.println(" ");

	}

	System.out.println("                        ");

	System.out.println("Transposed Matrix: ");

	for(int i=1; i <= size; i++)

	{

		for(int j=0; j<size*size; j=j+size)

		{

			System.out.print(j+i);

		}

		System.out.println(" ");

	}

	}

	}