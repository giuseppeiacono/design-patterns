package com.pippo;

/**
 * Extra ingredient milk.
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
public class Milk extends ExtraIngredients {

    // Beverage wrapped by this decorator
    private Beverage beverage;

    public Milk(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getBeverageDescription() {
        return beverage.getBeverageDescription() + ", Milk";
    }

    @Override
    public double getBeverageCost() {
        return beverage.getBeverageCost() + 0.3;
    }

}
