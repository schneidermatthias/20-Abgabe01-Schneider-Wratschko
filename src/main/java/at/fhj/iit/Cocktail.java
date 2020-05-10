package at.fhj.iit;


import java.util.ArrayList;

public class Cocktail extends Drink {

	

	/**
	 * @author Matthias
	 * @author Vinzen
	 * @version 1.0
	 */

	boolean alcoholic;
	Liquid liquidType;
	ArrayList<String> ingredients = new ArrayList<String>();

	/**
	 *
	 * @param shaken
	 * @param name
	 * @param liquidType
	 * @param ingredients constructor with parameters from class
	 */

	public Cocktail(String name, Liquid liquidType, boolean alcoholic, ArrayList ingredients) {
		super(name);
		this.name = name;
		this.liquidType = liquidType;
		this.alcoholic = alcoholic;
		this.ingredients= ingredients;
		
	}

	/**
	 * method for printing out the ingredients of a cocktail
	 * 
	 * @param ingredients
	 */

	/**
	 * @param shaken method, which asks the user, if is a fan of James Bond
	 *               exception if not shaken
	 */

	/**
	 *
	 * @return volume of the Drink Overriding getvolume() method
	 */
	@Override
	public double getVolume() {
		return 0;
	}

	/**
	 *
	 * @return percentage of the Drink Overriding getAlcoholPercent() method
	 */
	@Override
	public double getAlcoholPercent() {

		return liquidType.getAlcoholPercent();
	}

	/**
	 *
	 * @return true , if drink is alcholic Overriding isAlcoholic() method
	 */
	@Override
	public boolean isAlcoholic() {

		return liquidType.getAlcoholPercent() > 0;

	}
}

