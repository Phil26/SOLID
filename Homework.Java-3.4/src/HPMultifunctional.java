
public class HPMultifunctional implements Printer, Scanner, Fax
{

	public void print()
	{
		System.out.println("The print function of HP multifunctional printer is now active.");
	}
	
	public void scan()
	{
		System.out.println("Ready for scanning...");
	}
	
	public void fax()
	{
		System.out.println("Fax service available.");
	}
	
	
}
