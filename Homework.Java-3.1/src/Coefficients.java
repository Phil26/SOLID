
public class Coefficients 
{

	private float coef1;
	private float coef2;
	
	public Coefficients(float coef1, float coef2)
	{
		this.coef1 = coef1;
		this.coef2 = coef2;
	}
	
	public void setCoef(float c1, float c2)
	{
		this.coef1 = c1;
		this.coef2 = c2;
	}
	
	public float getC1()
	{
		return this.coef1;
	}
	
	public float getC2()
	{
		return this.coef2;
	}
	
	
}
