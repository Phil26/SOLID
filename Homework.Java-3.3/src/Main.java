import java.util.ArrayList;
import java.util.List;

public class Main 
{
    
	public static void main(String[] args)
    {
	
	List<Shape> shapeList = new ArrayList<Shape>();
	shapeList.add(new Circle(1));
	shapeList.add(new Rectangle(3,4));
	shapeList.add(new Square(5));
	
	AreasSum sum = new AreasSum();
	double result = sum.computeSum(shapeList);
	
	System.out.println("The sum of all shapes areas is " + result + ".");
	
    }	
	
}
