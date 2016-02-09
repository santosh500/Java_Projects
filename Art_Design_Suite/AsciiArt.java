/* -----------------------------------------------------------------------------
 *
 * File Name:  AsciiArt.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Homework 2
 * Description:  This program obtains user input for various patterns and prints out accordingly.
 * Date: 03-03-15
 *
 ---------------------------------------------------------------------------- */

import java.util.Scanner;
public class AsciiArt {

	public static void main(String[] args)

{

	Scanner kb = new Scanner(System.in);

	System.out.println("Choose one of the following patterns by typing the corresponding number: ");
	System.out.println("1) Stripes");
	System.out.println("2) Checker Board");
	System.out.println("3) Double Diagonal (aka the X");
	System.out.println("4) Two Islands");

		
	int type=kb.nextInt();
    
	System.out.println("Input a size (must be larger than 1):");
	int size=kb.nextInt();
	if (size <= 0 || (type > 4 || (type < 1)))
	{
		System.out.println("Error");
	}
	
	if (type == 1)

	{

		for(int i=0; i< size; i++)

		{

			for(int j=0;j<size;j++)

			{

				if((j % 2) == 0)

				{

					System.out.print("*");

				}

				else

				{

					System.out.print(' ');

				}

			}

			System.out.println("");

		}

	}

	else if (type == 2)

	{

		for(int i=0; i < size; i++)

		{

			if((i % 2) == 0)

			{

				for(int j = 0; j < size; j++)

				{

					if((j % 2) == 0)

					{

						System.out.print("*");

					}

					else

					{

						System.out.print(' ');

					}

				}

			}

			else

			{

				for(int j = 0; j < size; j++)

				{

					if((j % 2) == 0)

					{

						System.out.print(' ');

					}

					else

					{

						System.out.print("*");

					}

				}

			}

			System.out.println("");

		}

	}

	else if (type == 3)

	{

		for(int i=0; i < size; i++)

		{

			for(int j=0; j< size; j++)

			{

				if (j==i)

				{
					
					System.out.print("*");

				}

				else if (j==(size-i-1))

				{

					System.out.print("*");

				}

				else

				{

					System.out.print(' ');

				}

			}

			System.out.println("");

		}

	}

	else if (type == 4)

	{

		for(int i= 0; i< size; i++)

		{

			for(int j=0; j< size; j++)

			{

				if(j==size-1-i)

				{

					System.out.print("*");

				}

				else if((i<(size/2)) && (j<(size/2)))

				{

					System.out.print("!");

				}

				else if((i>=(size/2)) && (j>=(size/2)))

				{

					if(size%2 == 0 && (i>=(size/2) && (j>=(size/2))))

					{

						System.out.print("?");

					}

					else if(size%2 != 0 && (i>(size/2) && (j>(size/2))))

					{

						System.out.print("?");

					}

					else

					{

						System.out.print("~");

					}

				}

				else

				{

					System.out.print("~");

				}

			}

			System.out.println("");

		}

	}

	
	}

}
