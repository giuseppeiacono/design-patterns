package com.pippo;

/**
 * Abstract class that represent all beverages and extra ingredients offered by our bar.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * Components = beverages
 * Decorators = extra ingredients
 *
 * Both components and decorators must extend this class just to have the same type.
 * In this way decorators can wrap components and add new behaviours
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public abstract class Beverage {

    String beverageDescription = "Undefined Beverage";

    public String getBeverageDescription() {
        return beverageDescription;
    }

    /**
     * Calculate the cost of beverage including extra ingredients required by client.
     *
     * @return the total cost of beverage
     */
    public abstract double getBeverageCost();

}
