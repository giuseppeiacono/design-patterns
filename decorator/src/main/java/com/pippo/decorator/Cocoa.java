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
package com.pippo.decorator;

import com.pippo.component.Beverage;

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
