/* -----------------------------------------------------------------------------
 *
 * File Name:  Banana Stand
 * Author: Paul Charles
 * KUID: 2337615
 * Email Address: santosh@ku.edu
 * Homework Assignment Number: 1
 * Description:  Gives prices of all services and products for a fresh produce business
 * Date: 02-18-15
 *
 ---------------------------------------------------------------------------- */


import java.util.Scanner; 
public class Bananas {
 
 
 
public static void main(String[] args)
 
{ Scanner kb = new Scanner(System.in);

	
 
 
 
System.out.println("Welcome to the Banana Stand!");
 
System.out.println("-------------------------");

System.out.println("Select type of banana:");

System.out.println("Regular (r/R) (no markup");
 

System.out.println("Organic (o/O) (20% markup)");
 

System.out.println("Saturated with Gamma Rays (g/G) (50% markup)");
 
 
 
System.out.print("Input your choice: ");
 
 
 
 
 
String s2 = " ";
 
s2 = kb.nextLine();
 
double p2 = 0;
 
if (s2.charAt(0) == 'r' || s2.charAt(0) == 'R')
 
{
 
p2 = 0.0;
 
}
 
else if (s2.charAt(0) == 'o' || s2.charAt(0) == 'O')
 
{
 
p2 = 0.2;
 
}
 
else if (s2.charAt(0) == 'g' || s2.charAt(0) == 'G')
 
{
 
p2 =0.5;
 
}
 else
 
{
 
System.out.print("Please enter a type of banana");
 
}
 
 
 
System.out.println("-------------------------");
 
 
 
System.out.println("Select color of banana:");
 

System.out.println("Yellow (y/Y) (no discount)");
 

System.out.println("Green (g/G) (10% discount)");
 

System.out.println("Mixed (m/M) (5% discount)");
 
 
 
System.out.print("Input your choice: ");
 
 
 
String s3 = "";
 
s3 = kb.nextLine();
 
double p3 = 0;
 
if (s3.charAt(0) == 'y' || s3.charAt(0) == 'Y')
 
{
 
p3 = 0.0;
 
}
 
else if (s3.charAt(0) == 'g' || s3.charAt(0) == 'G')
 
{
 
p3 = 0.1;
 
}
 
else if (s3.charAt(0) == 'm' || s3.charAt(0) == 'M')
 
{
 
p3 = 0.05;
 
}
 
else
 
{
 
System.out.print("please enter a valid color");
 
}

System.out.println("-------------------------");

double s1 = 0;

 
System.out.print("How many bananas do you want?: ");
s1 = kb.nextDouble(); 

System.out.println("-------------------------");

String a1 = " ";

System.out.print("Input your street address: " + a1);

a1 = kb.next();

String a2 = " ";

System.out.print("Input your city: " + a2);

a2 = kb.next();

String a3 = " ";

System.out.print("Input your state: " + a3);

a3 = kb.next();
 
double c9 = 0;
 
if ((a3.charAt(0) == 'K' || a3.charAt(0) == 'k') && (a3.charAt(1) == 'A' || a3.charAt(1) == 'a') && (a3.charAt(2) == 'N' || a3.charAt(2) == 'n') && (a3.charAt(3) == 'S' || a3.charAt(3) == 's') && (a3.charAt(4) == 'A' || a3.charAt(4) == 'a') && (a3.charAt(5) == 'S' || a3.charAt(5) == 's') )
{
c9 = 0;
}
else
{
c9 = 35.50;
}
 
String a4 = " ";
System.out.print("Input your zip code: " + a4);
a4 = kb.next();

System.out.println("-------------------------");
 
 

 

 
 
if (s1 > 0)
 
{
 
double m1 = s1*0.03; 	
System.out.printf("Total cost for %.0f", s1);
System.out.printf(" banana(s) before markups or discounts is $%.2f ", m1);
}
 
else
 
{
 
System.out.print("Please enter a number of bananas");
 
}
 
double p5=(s1*p2*0.03)+c9;
 
System.out.printf("\nTotal markups: $%.2f ", p5);
 
double p6=s1*p3*0.03;
 
System.out.printf("\nTotal discount: $%.2f ", p6);
 
double c1 = (s1*0.03)+p5-p6;
 
System.out.printf("\nTotal cost: $%.2f ", c1);
 
System.out.print("\nShipping to: ");

System.out.println("\n \t" + a1);

System.out.println(" \t" + a2);

System.out.println(" \t" + a3);

System.out.println(" \t" + a4);



 
}

}