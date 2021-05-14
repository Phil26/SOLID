
public class Rectangle implements Shape
{
    public double height, width; 
	
    public Rectangle(double h, double w)
    {
    	this.height = h;
    	this.width = w;
    }

    public double computeArea()
    {
    	return height * width;
    }
    
    public void display()
    {
    	System.out.println("Area of rectangle is " + this.computeArea());
    }
}

