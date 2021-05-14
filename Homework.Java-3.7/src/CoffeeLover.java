import java.util.List;
import java.util.ListIterator;

public class CoffeeLover 
{
	private List<CoffeeMachine> coffeeMachines;
	
	public CoffeeLover()
	{
	System.out.println("A new coffee lover joined.");
	}
	
	// the list of coffee machines was 'injected' in makeCoffee() public method this time
	public void makeCoffee(List<CoffeeMachine> coffeeMachines) 
	{
		ListIterator<CoffeeMachine> it = coffeeMachines.listIterator();
	    while(it.hasNext())
	    {
	    CoffeeMachine machine = it.next();
	    machine.start();
	    }
	}
	
}
