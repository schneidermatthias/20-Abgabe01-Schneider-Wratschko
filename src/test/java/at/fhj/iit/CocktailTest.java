

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;



@DisplayName ("Testing Cocktail implementation")
class CocktailTest {
	
	private Cocktail shake,stirred;
    	private ArrayList<Liquid> liq1, liq2;
    	private ArrayList<String> ing1 = new ArrayList<String>();

	/**
	 * inits liquid List and ingrediants List for each cocktail
	 */
	@BeforeEach
	public void setup() {
		liq1 = new ArrayList<>();
        	liq1.add(new Liquid("Rum",0.25,20.5));
        	liq1.add(new Liquid("Wasser",0.35,20.0));
        	ing1.add("Lime");
        	ing1.add("Sugar");
        	ing1.add("Apple");
        	shake = new Cocktail("Rum-Wasser",liq1,true,ing1,true);
		
	}
	
	/**
	 * test the getIngredients method
	 */
	
	
	/**
	 * test the shakenNotStirred method/exception
	 */
	
	
	/*
	 * test the getVolume method
	 */
	
	
	/**
	 * test the getAlcoholPercent method
	 */
	
	/**
	 * test the isAlcoholic method
	 */
	
	
}
