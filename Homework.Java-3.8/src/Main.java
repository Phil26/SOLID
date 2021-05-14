import java.util.List;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		List<ShapeDraw> drawShapes = new ArrayList<ShapeDraw>();
		drawShapes.add(new Circle());
		drawShapes.add(new Rectangle());
		drawShapes.add(new Square());
		
		Painter Picasso = new Painter(drawShapes);
		Picasso.drawShape();
	}
	
}
