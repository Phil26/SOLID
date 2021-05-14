
public class Main 
{

	public static void main(String[] args)
	{
		
		System.out.println("/ Testing all the implemented methods / \n");
		SamsungPrinter Samsung = new SamsungPrinter();
		Samsung.print();
		HPMultifunctional HP = new HPMultifunctional();
		HP.print();
		HP.scan();
		HP.fax();
	}

}
