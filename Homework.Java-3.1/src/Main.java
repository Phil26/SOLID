
public class Main 
{
	
	public static void main(String[] args)
	{	
		
		Coefficients eqCoeffs1 = new Coefficients(0, 2);
		Solution eqSolution1 = new Solution();
		eqSolution1.solveEquation(eqCoeffs1);
		saveToJSON saver = new saveToJSON();
		saver.save(eqSolution1);
		System.out.println("\n");
		
		
		Coefficients eqCoeffs2 = new Coefficients(2, 0);
		Solution eqSolution2 = new Solution();
		eqSolution2.solveEquation(eqCoeffs2);
		saver.save(eqSolution2);
		System.out.println("\n");
		
		
		Coefficients eqCoeffs3 = new Coefficients(0, 0);
		Solution eqSolution3 = new Solution();
		eqSolution3.solveEquation(eqCoeffs3);
		saver.save(eqSolution3);
		System.out.println("\n");
		
		
		Coefficients eqCoeffs = new Coefficients(2, 3);
		Solution eqSolution = new Solution();
		eqSolution.solveEquation(eqCoeffs);
		saver.save(eqSolution);
		System.out.println("\n");
		
		System.out.println("The final Json is: ");
		saver.displaySolution();
		
	}
		
}
