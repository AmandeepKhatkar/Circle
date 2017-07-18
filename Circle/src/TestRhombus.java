import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRhombus {

	public static void main(String[] args) {
		double digonal1;
		double digonal2;
		
		Rhombus R1 = new Rhombus();
		Rhombus R2 = new Rhombus(4.0,5.0);
		Scanner input = new Scanner(System.in);
		

		System.out.println("Area of Rhombus (default values) is: " + R1.getArea());
		System.out.println("Parameter of Rhombus (default values) is: " + R1.getPerimeter());
		System.out.println("Area of Rhombus(digonal1=4.0 , digonal2 = 5.0 )  is: " + R2.getArea());
		System.out.println("Parameter of Rhombus (digonal1=4.0 , digonal2 = 5.0 )  is: " + R2.getPerimeter());
		System.out.println("Enter 2 digonals of Rhombus  of your choice ");
		do
		{
			
			try 
			{
				System.out.println("Enter digonal1: ");
				 digonal1 = input.nextDouble();
				System.out.println("Enter digonal2: ");
				 digonal2 = input.nextDouble();
				break;
			}
			catch(final InputMismatchException e)
			   {
				System.out.println("You have entered an Invalid Choice.Please re-enter your choice");
				input.nextLine();
				continue;
			   }
		}while(true);
		
		R1.setFistDiagonal(digonal1);
		R1.setSecondDiagonal(digonal2);
	
		
		System.out.println("Area of Rhombus with digonal1 = "+digonal1+" , digonal2 =  "+digonal2+" is " +R1.getArea());
		System.out.println("Parameter of Rhombus with digonal1 "+digonal1+" , digonal2 "+digonal2 +" is " +R1.getPerimeter());
		input.close();
		
		
		
				
				

	}

}
