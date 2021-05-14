import java.util.List;
import java.util.ArrayList;


public class Main 
{
  public static void main(String[] args)
  {
	 System.out.println("/ Application test / \n");
	  
	  List<CoffeeMachine> coffeeMachines = new ArrayList<CoffeeMachine>();
	  coffeeMachines.add(new SimpleCoffeeMachine());
	  coffeeMachines.add(new ComplexCoffeeMachine());
	  CoffeeLover customer = new CoffeeLover();
	  customer.makeCoffee(coffeeMachines);	// coffeeMachines list was injected as a parameter here 
  }
 
}
