import java.util.List;
import java.util.ListIterator;

public class Painter 
{

	public List<ShapeDraw> shapes;
	
	
	public Painter(List<ShapeDraw> shapes)
	{
		this.shapes = shapes;
	}
	
	public void drawShape()
	{
		ListIterator<ShapeDraw> it = shapes.listIterator();
	    while(it.hasNext())
	    {
	    ShapeDraw shape = it.next();
	    shape.draw();
	    }
	
    }
	
}
