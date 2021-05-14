import java.util.List;
import java.util.ListIterator;

class AreasSum 
{
	public List<Shape> shapes;
	public double totalArea = 0;
	
	public double computeSum(List<Shape> shapes)
	{
       ListIterator<Shape> li = shapes.listIterator();
       while(li.hasNext())
       {
    	   Shape it = li.next();
    	   totalArea += it.getArea();
       }
	     return totalArea;
	}

}
