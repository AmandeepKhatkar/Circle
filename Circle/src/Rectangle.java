
public class Rectangle
{
	double length=1.0;
	double width = 1.0;
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		this.length = length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	Rectangle() {
	}

	Rectangle(double l,double w)
	{
	  length = l;
	  width = w;
	}

	double getArea() 
	    {
		
		  return length*width;
		
			
		}

    double getPerimeter()
    {
		  return 2*(length+width);
	}
	

}
