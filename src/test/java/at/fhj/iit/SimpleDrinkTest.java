package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDrinkTest {

    private Liquid milk;

    /**
     * creating a Simpledrink object
     */
    @BeforeEach
    public void setup() {
        SimpleDrink milkShake = new SimpleDrink("Milk", milk);

    }


    /**
     * Test getVolume method
     */
    @Test
    void getVolume() {
    }

    /**
     * Test getAlcoholPercent method
     */
    @Test
    void getAlcoholPercent() {
    }

    /**
     * Test isAlcohlic method
     */
    @Test
    void isAlcoholic() {
    }
}