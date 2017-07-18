import java.util.InputMismatchException;
import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args)
	{
		double length1;
		double length2;
		double length3;
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(3.0,4.0,5.0);
		Scanner input = new Scanner(System.in);
		

		System.out.println("Area of triangle (default values) is: " + t1.getArea());
		System.out.println("Parameter of triangle (default values) is: " + t1.getPerimeter());
		System.out.println("Area of triangle (Length1=3.0 , length2 = 4.0 and length = 5.0)  is: " + t2.getArea());
		System.out.println("Parameter of triangle (Length1=12.0 , length2 = 6.0 and length = 3.0)  is: " + t2.getPerimeter());
		System.out.println("Enter 3 lengths of triangle  of your choice ");
		do
		{
			
			try 
			{
				System.out.println("Enter length1: ");
				 length1 = input.nextDouble();
				System.out.println("Enter length2: ");
				 length2 = input.nextDouble();
				 System.out.println("Enter length3: ");
				 length3 = input.nextDouble();
				break;
			}
			catch(final InputMismatchException e)
			   {
				System.out.println("You have entered an Invalid Choice.Please re-enter your choice");
				input.nextLine();
				continue;
			   }
		}while(true);
		
		t1.setFirstLength(length1);
		t1.setSecondLength(length2);
		t1.setThirdLength(length3);
		
		System.out.println("Area of triangle with length1 = "+length1+" , length2 =  "+length2+" and length3 = "+length3+" is " +t1.getArea());
		System.out.println("Parameter of triangle with length "+length1+" , length2 "+length2 +" and length3 "+length3+" is " +t1.getPerimeter());
		input.close();
		
		
		
				
				
				
				
		}
		

		
		
		

	}



