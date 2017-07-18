import java.util.InputMismatchException;
import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args)
	{
		double length;
		double width;
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(12.0,6.0);
		Scanner input = new Scanner(System.in);
		

		System.out.println("Area of Rectangle (default values) is: " + r1.getArea());
		System.out.println("Area of Rectangle (Length=12.0 and width = 6.0)  is: " + r2.getArea());
		System.out.println("Enter length and width  of your choice ");
		do
		{
			
			try 
			{
				System.out.println("Enter length: ");
				 length = input.nextDouble();
				System.out.println("Enter width: ");
				 width = input.nextDouble();
				break;
			}
			catch(final InputMismatchException e)
			   {
				System.out.println("You have entered an Invalid Choice.Please re-enter your choice");
				input.nextLine();
				continue;
			   }
		}while(true);
		
		r1.setLength(length);
		r1.setWidth(width);
		
		System.out.println("Area of triangle with length "+length+" and width "+width +" is " +r1.getArea());
		System.out.println("Parameter of triangle with length "+length+" and width "+width +" is " +r1.getPerimeter());
		input.close();
		
		
		
				
				
				
				
		}
		

		
		
		

	}


