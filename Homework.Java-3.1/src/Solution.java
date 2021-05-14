

public class Solution 
{

	public float x, x1, x2, x3;
	// where x is the result for the first case, x1 for the second case,
	// x2 for the third case & x3 for the fourth case
	public Coefficients coefficients;
	
	public Solution()
	{
	
	}
	
	public float solveEquation(Coefficients coef)
	{
		
		System.out.println("First degree equation will be solved.");
		if(coef.getC2() == 0 && coef.getC1() != 0)
		{
			System.out.println("The coefficient of x^0 is 0. The value of x will be 0.");
			x = 0;
			return x;
			// 0 divided by any number is 0.
		}
		
		else if(coef.getC1() == 0 && coef.getC2() != 0)
		{
		    System.out.println("Division by 0 occurred. Illegal operation.");
			x1 = 0;
		    return x1;
			// here division by 0 is illegal. So 0 will be returned.
		}
		
		else if(coef.getC1() == 0 && coef.getC2() == 0)
		{
			System.out.println("The solution is null.");
			x2 = 0;
			return x2;
			// same cases as above
		}
		
		else 
		{
			x3 = -(coef.getC2() / coef.getC1());
			return x3;
		}
		
	}
		
}
