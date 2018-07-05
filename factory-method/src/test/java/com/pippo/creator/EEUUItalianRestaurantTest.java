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
package com.pippo.creator;

import org.junit.Test;

/**
 * Tests of italian restaurant in EEUU.
 *
 * @author Giuseppe Iacono
 */
public class EEUUItalianRestaurantTest {

    @Test
    public void testEEUUItalianRestaurant_whenAllTypesOfPastaAreRequiredByClient_thenTheyArePrepared() {
        ItalianRestaurant EEUUitalianRestaurant = new EEUUItalianRestaurant();
        ItalianRestaurant USAItalianRestaurant = new USAItalianRestaurant();

        // test
        System.out.println("\nThe following plates of pasta were ordered at one of our Italian restaurants in EEUU");
        System.out.println("-------------------------------------------------------------------------------------");
        EEUUitalianRestaurant.orderPasta(ItalianRestaurant.CARBONARA);
        System.out.println("");
        EEUUitalianRestaurant.orderPasta(ItalianRestaurant.MELENZANE_AND_SPADA);

        System.out.println("\nThe following plates of pasta were ordered at one of our Italian restaurants in USA");
        System.out.println("-------------------------------------------------------------------------------------");
        USAItalianRestaurant.orderPasta(ItalianRestaurant.CARBONARA);
        System.out.println("");
        USAItalianRestaurant.orderPasta(ItalianRestaurant.MELENZANE_AND_SPADA);
    }

}
