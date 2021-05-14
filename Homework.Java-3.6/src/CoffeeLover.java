import java.util.List;
import java.util.ListIterator;

public class CoffeeLover 
{
	private List<CoffeeMachine> coffeeMachines;
	
	public CoffeeLover(List<CoffeeMachine> coffeeMachines)
	{
	this.coffeeMachines = coffeeMachines;
	}
	
	public void makeCoffee() 
	{
		ListIterator<CoffeeMachine> it = coffeeMachines.listIterator();
	    while(it.hasNext())
	    {
	    CoffeeMachine machine = it.next();
	    machine.start();
	    }
	}
	
}
