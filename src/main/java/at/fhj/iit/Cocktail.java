package at.fhj.iit;

import java.util.ArrayList;

/**
 * Class represents a Cocktail which extends drinks
 * @author Matthias
 * @author Vinzenz
 * @version 1.2
 */

public class Cocktail extends Drink {

	boolean shaken;
	private ArrayList<Liquid> liquid;
	ArrayList<String> ingredients = new ArrayList<String>();
	boolean bigCockatil;

	/**
	 *
	 * @param name name of the cockatil
	 * @param liquid represents an list of Liquid objects
	 * @param shaken describes if cocktail is shaken
	 * @param ingredients list with ingredients of cocktail
	 * @param bigCockatil doubles the volume
	 * constructor with parameters from class
	 */

	public Cocktail(String name, ArrayList<Liquid> liquid, boolean shaken, ArrayList<String> ingredients,boolean bigCockatil) {
		super(name);
		this.name = name;
		this.liquid = liquid;
		this.shaken = shaken;
		this.ingredients= ingredients;
		this.bigCockatil = bigCockatil;
	}

	/**
	 * method for printing out the ingredients of a cocktail
	 *
	 */

	public String getIngredients(){
		String a = "";
		for (int i = 0; i < ingredients.size(); i++) {
			a += ingredients.get(i) + " ";
		}
		return a;
	}

	/**
	 * @param shaken describes if Cocktail is shaken
	 * @throws JamesBondException if not shaken
	 * method gives user a message from James Bond
	 */
	public void shakenNotStirred(boolean shaken) throws JamesBondException{
			if(!shaken){
				throw new JamesBondException("Mr. Bond wouldn't be satisfied");
			}
			else{
				System.out.println("Mr. Bond would be satisfied");
			}
		}	
	/**
	 *
	 * @return volume of the Drink Overriding getvolume() method
	 */
	@Override
	public double getVolume() {
		double volume = 0;
		for (Liquid liquid : liquid) {
			volume += liquid.getVolume();
		}
		if (bigCockatil) {
			return volume * 2;
		}

		return volume;
	}

	/**
	 *
	 * @return percentage of the Drink Overriding getAlcoholPercent() method
	 */
	@Override
	public double getAlcoholPercent() {
		double percentage = 0;

		for(int i=0;i<liquid.size();i++){
			if (liquid.get(i).getAlcoholPercent()==0){
				percentage += 0;
			}
			else {
				percentage += (liquid.get(i).getVolume() * 1000) / liquid.get(i).getAlcoholPercent();
			}
		}
		return Math.floor(percentage);
	}

	/**
	 *
	 * @return true , if drink is alcholic Overriding isAlcoholic() method
	 */
	@Override
	public boolean isAlcoholic() {

		return getAlcoholPercent() > 0;

	}
}

