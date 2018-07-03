package com.pippo;

/**
 * Extra ingredient cocoa.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * This class is a decorator because it extends ExtraIngredients.
 * The composition allows to add new behaviour at runtime because the reference of beverage is saved when Milk is instantiated.
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public class Cocoa extends ExtraIngredients {

    // Beverage wrapped by this decorator
    private Beverage beverage;

    public Cocoa(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getBeverageDescription() {
        return beverage.getBeverageDescription() + ", Cocoa";
    }

    @Override
    public double getBeverageCost() {
        return beverage.getBeverageCost() + 0.5;
    }

}
