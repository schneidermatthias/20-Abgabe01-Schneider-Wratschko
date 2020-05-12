import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {

	private SimpleDrink lA, lN;

	/**
	 * inits an alcoholic and nonalcoholic liquid for EACH test
	 */
	@BeforeEach
	void setup() {
		// SETUP PHASE
		lN = new SimpleDrink("Wasser", new Liquid("Wasser", 1.0, 0));
		lA = new SimpleDrink("Bier", new Liquid("Bier", 0.5, 7.5));

	}

	@Test
	@DisplayName("Testing constructor non alcoholic")
	public void testConstructorNonAlcoholic() {
		assertEquals("Wasser", lN.getName());
		assertEquals(0, lN.getAlcoholPercent());
		assertEquals(1.0, lN.getVolume());
	}

	@Test
	@DisplayName("Testing constructor alcoholic")
	public void testConstructorALcoholic() {
		assertEquals("Bier", lA.getName());
		assertEquals(7.5, lA.getAlcoholPercent());
		assertEquals(0.5, lA.getVolume());
	}

}
