package com.pippo;

/**
 * Cappuccino beverage.
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
public class Cappuccino extends Beverage {

    public Cappuccino() {
        beverageDescription = "Cappuccino";
    }

    @Override
    public double getBeverageCost() {
        return 1.20;
    }

}
