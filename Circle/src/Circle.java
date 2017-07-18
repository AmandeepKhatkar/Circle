
public class Circle {


		
	
			double radius = 1.0;//initilization

			public double getRadius() {
				return radius;
			}

			public void setRadius(double radius) {
				this.radius = radius;
			}

			Circle() {
			}

			Circle(double newRadius) {
			  radius = newRadius;
			}

			double getArea() {
			  return radius * radius * 3.14159;
			}

			double getPerimeter() {
			  return 2 * radius * 3.14159;
			}
		


	

}
	
