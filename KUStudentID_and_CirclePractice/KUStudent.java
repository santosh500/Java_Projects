/* -----------------------------------------------------------------------------
 *
 * File Name:  KUStudent.java
 * Author: Paul Charles
 * Assignment:   EECS-168/169 Lab 9
 * Description:  This program serves as a clas to store the names, ID, and department of the student.
 * Date: 04-13-15
 *
 ---------------------------------------------------------------------------- */
package lab9;

public class KUStudent {
	
	private String stud_fname;
	private String stud_lname;
	private String stud_kuid;
	private String stud_dept;
	
	public void set_name(String stud_fname1, String stud_lname1)
	{
		
		stud_fname=stud_fname1;
		stud_lname=stud_lname1;
		
	}
	
	public void set_kuinfo(String stud_kuid1, String stud_dept1)
	{
		stud_kuid=stud_kuid1;
		stud_dept=stud_dept1;
	}
	
	public String get_fname()
	{
		
		return(stud_fname);
	}
	
	public String get_lname()
	{
		
		return(stud_lname);
	}

	public String get_id()
	{
		
		return(stud_kuid);
	}
	
	public String get_dept()
	{
		
		return(stud_dept);
	}
}
