/**
 MIT License

 Copyright (c) 2018 giuseppe iacono

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */
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
