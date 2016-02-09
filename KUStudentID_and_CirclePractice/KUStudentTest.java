/* -----------------------------------------------------------------------------
 *
 * File Name:  KUStudentTest.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 9
 * Description:  This program deals with obtaining several methods from KUStudent and using them. 
 * Date: 04-13-15
 *
 ---------------------------------------------------------------------------- */
package lab9;

import java.util.Scanner;

public class KUStudentTest {
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		KUStudent test = new KUStudent();
		System.out.println("Please input the student's name");
		String firstname = kb.next();
		String lastname = kb.nextLine();
		test.set_name(firstname,lastname);
		System.out.println("Please input the student's KUID and department: ");
		String id=kb.next();
		String dept=kb.nextLine();
		test.set_kuinfo(id, dept);	
		writeOutput(test);
		
	}
	
	public static void writeOutput(KUStudent test)
	{
	
		String a=test.get_fname();
		String b=test.get_lname();
		String c=test.get_id();
		String d=test.get_dept();
		System.out.println("Student: "+ a + " " + b);
		System.out.println("KUID: " + c);
		System.out.println("Department: " + d);
	}
}
