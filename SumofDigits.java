import java.util.Scanner;


public class SumofDigits {

public static void main(String[] args)
{
	Scanner kbInput = new Scanner(System.in);
	int k,c;
	do{
	System.out.println("Please enter a No: ");
	k = kbInput.nextInt();
	int o = sum(k);
	System.out.println("The sum of the digits: " + o);
	System.out.println("Want to try again? (y=1/n=0)");
	c=kbInput.nextInt();
	}while(c==1);
	System.out.println("Thank you!");
	
}
	

public static int sum(int k)
{	
	int sum2 = 0;
	for(int i=k; i > 0; i=(i/10))
	{
		int j;
		j=(i%10);
		sum2=sum2+j;
	}
	return(sum2);
}




}