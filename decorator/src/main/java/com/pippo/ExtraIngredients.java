package com.pippo;

/**
 * Extra ingredients.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * All classes that extend this class will be called decorators in this pattern.
 * They must provide description and cost of the beverage which wrapped.
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public abstract class ExtraIngredients extends Beverage {

    /**
     * Create a complete description of beverage required by client, including extra ingredients.
     *
     * @return beverage description
     */
    public abstract String getBeverageDescription();

}
