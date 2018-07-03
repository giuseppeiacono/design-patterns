package com.pippo;

/**
 * Espresso beverage.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * All classes that extend directly the abstract class Beverage are called component in this pattern.
 * Their instances can be wrapped by decorators.
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public class Espresso extends Beverage {

    public Espresso() {
        beverageDescription = "Espresso";
    }

    @Override
    public double getBeverageCost() {
        return 0.80;
    }

}
