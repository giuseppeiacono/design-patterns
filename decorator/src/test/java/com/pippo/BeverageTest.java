package com.pippo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests of beverages with extra ingredients.
 *
 * @author Giuseppe Iacono
 */
public class BeverageTest {

    // beverages
    private final String ESPRESSO_DESC = "Espresso";
    private final String CAPPUCCINO_DESC = "Cappuccino";
    private final double ESPRESSO_COST = 0.8;
    private final double CAPPUCCINO_COST = 1.2;

    // extra ingredientes
    private final String MILK_DESC = ", Milk";
    private final double MILK_COST = 0.3;
    private final String COCOA_DESC = ", Cocoa";
    private final double COCOA_COST = 0.5;

    @Test
    public void testBeverage_whenExtraIngredientsAreNotRequired_thenDescriptionShowsTheNameOfBeverageAndItsCost() {
        // test
        Beverage espresso = new Espresso();
        Beverage cappuccino = new Cappuccino();

        // assertions
        System.out.println("\nSales receipt\n-----------------------");
        assertDescAndCostOfBeverage(espresso, ESPRESSO_DESC, ESPRESSO_COST);
        assertDescAndCostOfBeverage(cappuccino, CAPPUCCINO_DESC, CAPPUCCINO_COST);
    }

    @Test
    public void testBeverage_whenExtraIngredientsAreRequired_thenDescriptionShowsTheNameOfBeverageAndExtraIngredientsAndTotalCost() {
        // test
        Beverage espressoWithoutExtraIngredients = new Espresso();

        Beverage espresso = new Espresso();
        espresso = new Cocoa(espresso);
        espresso = new Milk(espresso);

        Beverage cappuccino = new Cappuccino();
        cappuccino = new Cocoa(cappuccino);
        cappuccino = new Cocoa(cappuccino);

        // assertions
        System.out.println("\nSales receipt\n-----------------------");

        assertDescAndCostOfBeverage(espressoWithoutExtraIngredients, ESPRESSO_DESC, ESPRESSO_COST);

        String expectedEspressoDesc = ESPRESSO_DESC + COCOA_DESC + MILK_DESC;
        double expectedEspressoCost = ESPRESSO_COST + COCOA_COST + MILK_COST;
        assertDescAndCostOfBeverage(espresso, expectedEspressoDesc, expectedEspressoCost);

        String expectedCappuccinoDesc = CAPPUCCINO_DESC + COCOA_DESC + COCOA_DESC;
        double expectedCappuccinoCost = CAPPUCCINO_COST + COCOA_COST + COCOA_COST;
        assertDescAndCostOfBeverage(cappuccino, expectedCappuccinoDesc, expectedCappuccinoCost);
    }

    private void assertDescAndCostOfBeverage(final Beverage beverage, final String expectedDesc, final double expectedCost) {
        assertEquals("The description of beverage should be: " + expectedDesc, expectedDesc, beverage.getBeverageDescription());
        assertTrue("The cost of beverage should be " + expectedCost + "€", expectedCost == beverage.getBeverageCost());
        System.out.println(beverage.getBeverageDescription() + " " + beverage.getBeverageCost());
    }

}
