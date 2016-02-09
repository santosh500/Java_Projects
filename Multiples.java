

	
	import java.util.Scanner;
	public class Multiples {
		
		public static void main(String[] args)
		{
			Scanner kbInput = new Scanner(System.in);
			int i;
			int k;
			int mult;
			int result;
			int count;
			System.out.println("What number do you wish to see multiples of?");
			k = kbInput.nextInt();
			System.out.println("How many multiples?");
			mult = kbInput.nextInt();
			count=k*mult;
			if (mult > 0)
		
				for (i=1 ; i <= mult; i++ )
				{
						
						result = k*i;
						System.out.println(result);
					
				}
			else
			{
				System.out.println("Error: The multiple has to be greater than zero");
			}
				
			
		}

	}
