package at.fhj.iit;

import java.util.ArrayList;

/**
 * Class represents a Cocktail which extends drinks
 * @author Matthias
 * @author Vinzen
 * @version 1.1
 */

public class Cocktail extends Drink {

	boolean shaken;
	Liquid liquidType;
	ArrayList<String> ingredients = new ArrayList<String>();
	boolean bigCockatil;

	/**
	 *
	 * @param shaken describes if cocktail is shaken
	 * @param name name of the cockatil
	 * @param liquidType represents an Object of Liquid
	 * @param ingredients List with ingredients of cocktail
     * @param bigCockatil either a big (1l) or small (0.5l)cocktail
     * constructor with parameters from class
	 */
	
	public Cocktail(String name, Liquid liquidType, boolean shaken, ArrayList<String> ingredients,boolean bigCockatil) {
		super(name);
		this.name = name;
		this.liquidType = liquidType;
		this.shaken = shaken;
		this.ingredients= ingredients;
		this.bigCockatil = bigCockatil;
	}

	/**
	 * method for printing out the ingredients of a cocktail
	 * 
	 */

	public void printIngredients(){
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(ingredients.get(i));
        }

    }

	/**
	 * @param shaken method, which asks the user, if is a fan of James Bond
     * @throws JamesBondException if not shaken
	 */
	public void shakenNotStirred(boolean shaken) throws JamesBondException{
	    try {
	        if(!shaken){
	            throw new JamesBondException("Mr. Bond wouldn't be satisfied");
            }
	        else{
                System.out.println("Like the good old Mr. Bond");

            }

        }
	    catch (JamesBondException ignored){

        }

    }

	/**
	 *
	 * @return volume of the Drink Overriding getvolume() method
	 */
	@Override
	public double getVolume() {
		return bigCockatil?1d:0.5d;
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

