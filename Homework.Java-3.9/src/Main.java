import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;


public class Main
{

	public static void main(String[] args)
	{
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(2));
		shapes.add(new Square(3));
		shapes.add(new Rectangle(1, 2));
		shapes.add(new Square(4));
		shapes.add(new Circle(5));
		shapes.add(new Rectangle(3, 4));
		
		ListIterator<Shape> it = shapes.listIterator();
		while(it.hasNext())
		{
			Shape anotherShape = it.next();
			anotherShape.computeArea();
			anotherShape.display();
		}	
	}
}
