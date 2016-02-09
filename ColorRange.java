import java.util.Scanner;
public class ColorRange {
	
	public static void main(String[] args)
	{
		Scanner kbInput = new Scanner(System.in);
		double wlength;
		System.out.print("Enter a wavelength in nm: ");
		wlength = kbInput.nextDouble();
		
		if (wlength >= 750)
		{
			System.out.println("The entered wavelength is not a part of the visible spectrum.");
		}
		else if (wlength >= 620)
		{
			System.out.println("The color is red");
		}
		else if (wlength >= 590)
		{
			System.out.println("The color is orange");
		}
		else if (wlength >= 570)
		{
			System.out.println("The color is yellow");
		}
		else if (wlength >= 495)
		{
			System.out.println("The color is green");
		}
		else if (wlength >= 450)
		{
			System.out.println("The color is blue");
		}
		else if (wlength >= 380)
		{
			System.out.println("The color is violet");
		}
		else
		{
			System.out.println("The entered wavelenth is not a part of the visible spectrum");
		}
	}

}
