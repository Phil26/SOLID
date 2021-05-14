import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class saveToJSON 
{
	
	public String json;

	public Solution solution;
    
	public String save(Solution solution)
	{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		json = gson.toJson(solution);
		return json;
		
	}
	
	public void displaySolution()
	{
		//System.out.println("Equation solution is" + this.json);
		System.out.println(this.json);
	}
	 
}
