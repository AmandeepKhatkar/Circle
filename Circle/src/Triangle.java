
public class Triangle 
{
	double firstLength=1.0;
	double secondLength=1.0;
	double thirdLength=1.0;
	public double getFirstLength() {
		return firstLength;
	}
	public void setFirstLength(double firstLength) {
		this.firstLength = firstLength;
	}
	public double getSecondLength() {
		return secondLength;
	}
	public void setSecondLength(double secondLength) {
		this.secondLength = secondLength;
	}
	public double getThirdLength() {
		return thirdLength;
	}
	public void setThirdLength(double thirdLength) {
		this.thirdLength = thirdLength;
	}
	Triangle(){
		
	}
	Triangle(double length1,double length2,double length3)
	{
		firstLength = length1;
		secondLength = length2;
		thirdLength = length3;
	}

	double getArea() 
	    {
		double p = (firstLength+secondLength+thirdLength)/2;
		double area = Math.sqrt(p*(p-firstLength)*(p-secondLength)*(p-thirdLength));
		  return area;
		}

    double getPerimeter()
    {
		  return firstLength+secondLength+thirdLength;
	}
	

}
