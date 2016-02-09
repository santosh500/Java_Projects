import java.util.Scanner;
public class UserLoop {
	
	public static void main(String[] args)
	{
		Scanner kbInput = new Scanner(System.in);
		int svalue;
		int evalue;
		System.out.print("Input a start value (included):");
		svalue = kbInput.nextInt();
		System.out.print("Input an ending value (excluded):");
		evalue = kbInput.nextInt();
		
		
		if (evalue > svalue)
		{
			for (svalue= svalue;  svalue <  evalue; svalue = svalue + 1)
			{
				System.out.println(svalue);
			}		
			
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}

}
