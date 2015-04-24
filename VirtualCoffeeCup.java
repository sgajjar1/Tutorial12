public class VirtualCoffeeCup implements VirtualCoffeeCupPlan{
	private String roast;
	private int temperature;
		
	public void setCupRoast(String roasts){
		roast = roasts;
	}

	public String getCupRoast(){
		return roast;
	}

	public void setCupTemperature(int temperatures){
		temperature= temperatures;
	}


	public int getCupTemperature(){
		return temperature;
	}
}