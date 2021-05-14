import java.lang.Math;

public class Circle implements Shape
{
	public double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double computeArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void display()
    {
    	System.out.println("Area of circle is " + this.computeArea());
    }
}
