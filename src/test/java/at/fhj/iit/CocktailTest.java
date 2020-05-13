package at.fhj.iit;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Cocktail implementation")
class CocktailTest {
	private Cocktail shake, stirred;
	private ArrayList<Liquid> liq1, liq2;
	private ArrayList<String> ing1, ing2;

	/**
	 * inits liquid List and ingrediants List for each cocktail
	 */

	@BeforeEach
	void setup() {
		liq1 = new ArrayList<>();
		ing1 = new ArrayList<>();
		liq1.add(new Liquid("Rum", 0.25, 20.5));
		liq1.add(new Liquid("Wasser", 0.35, 20.0));
		ing1.add("Lime");
		ing1.add("Sugar");
		ing1.add("Apple");
		shake = new Cocktail("Rum-Wasser-geschüttelt", liq1, true, ing1, true);

		liq2 = new ArrayList<>();
		ing2 = new ArrayList<>();
		liq2.add(new Liquid("Milch", 0.30, 0.0));
		liq2.add(new Liquid("Kindersekt", 0.20, 0.0));
		ing2.add("Sugar");
		stirred = new Cocktail("Milch-gerührt", liq2, false, ing2, false);

	}

	/**
	 * test the getIngredients method
	 */

	@Test
	@DisplayName("Testing ")
	public void TestIngredients() {
		assertEquals("Lime Sugar Apple ", shake.getIngredients());
		assertEquals("Sugar ", stirred.getIngredients());
	}

	/**
	 * test the isAlcoholic method
	 */

	@Test
	@DisplayName("Testing if its alcohol: ")
	public void Testifitsalcohol() {
//		assertEquals(true,shake.isAlcoholic());
		assertTrue(shake.isAlcoholic());
		assertFalse(stirred.isAlcoholic());

	}

	/**
	 * test the getAlcoholPercent method
	 */

	@Test
	@DisplayName("Testing getAlcoholPercent: ")
	public void TestgetAlcoholPercent() {
		assertEquals(29, shake.getAlcoholPercent());
		assertEquals(0,stirred.getAlcoholPercent());

	}

	/**
	 * test the getVolume method
	 */

	@Test
	@DisplayName("Testing volume")
	public void TestcheckVolume() {
		assertEquals(1.2, shake.getVolume());
		assertEquals(0.5, stirred.getVolume());
	}

	/**
	 * test the shakenNotStirred method/exception
	 */

	@Test
	@DisplayName("Testing exception")
	public void checkException() throws JamesBondException {
		shake.shakenNotStirred(shake.shaken);
		stirred.shakenNotStirred(stirred.shaken);
	}

}
