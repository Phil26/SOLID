
public class Square implements Shape 
{
    public double side;
    
    public Square(double s)
    {
    	this.side = s;
    }

    public double computeArea()
    {
    	return side * side;
    }
    
    public void display()
    {
    	System.out.println("Area of square is " + this.computeArea());
    }
}

