
public class Rhombus 
{

	double fistDiagonal=1.0;
	double secondDiagonal=1.0;
	public double getFistDiagonal() {
		return fistDiagonal;
	}
	public void setFistDiagonal(double fistDiagonal) {
		this.fistDiagonal = fistDiagonal;
	}
	public double getSecondDiagonal() {
		return secondDiagonal;
	}
	public void setSecondDiagonal(double secondSecondDiagonal) {
		this.secondDiagonal = secondSecondDiagonal;
	}
	Rhombus()
	{
		
	}
	Rhombus(double p,double q)
	{
		fistDiagonal = p;
		secondDiagonal= q;
		
	}
	double getArea() 
    {
	
	  return (fistDiagonal*secondDiagonal)/2;
	}

double getPerimeter()
{
	  double side = Math.sqrt((fistDiagonal*fistDiagonal+secondDiagonal*secondDiagonal)/2);
	  double parameter= 4*side;
	  return parameter;
}

	

}
