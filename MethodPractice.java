import java.util.Scanner;


public class MethodPractice {
public static void main(String[] args)
{
	Scanner kbInput = new Scanner(System.in);
	System.out.println("Input two numbers: ");
	int a = kbInput.nextInt();
	int b = kbInput.nextInt();
	int z = max(a,b);
	System.out.println("The max of " + a + " and " + b + " is: " + z);
	
	System.out.println("Input a radius: ");
	double r=kbInput.nextDouble();
	double q=sphereArea(r);
	System.out.println("The area of a sphere with this radius is: " + q);
	
	System.out.println("Input a string: ");
	String word = "";
	word=kbInput.next();
	System.out.println("How many times do you want to print it?: ");
	int timesToPrint =kbInput.nextInt();
	printWord(word,timesToPrint);
	
	
	
}
    
	public static int max(int a, int b)
	{
		int answer = 0;
		if (a>b)
		{
			answer =a;
		}
		else
		{
			answer = b;
		}
		return(answer);
	}
	public static double sphereArea(double r)
	{
		double answer2 = 0;
		if(r>0)
		{
		
		answer2 = 4*3.14159*(r*r);
		;
		}
		else
		{
			answer2=0.0;
		}
		return(answer2);
	}
	public static void printWord(String word, int timesToPrint)
	{
		
		if(timesToPrint > 0)
		{
			for(int i=0; i < timesToPrint; i++)
			{
				System.out.println(word);
			}
		}
		else
		{
			System.out.println("hi");
		}
			
	}
	}