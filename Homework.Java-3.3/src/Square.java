import java.lang.Math;

public class Square implements Shape 
{

	public double shapeSide;
	
	public Square(double shapeSide)
	{
		super();
		this.shapeSide = shapeSide;
	}
	
	@Override
	public double getArea()
	{
		return Math.pow(this.shapeSide, 2);
	}
	
	
}
