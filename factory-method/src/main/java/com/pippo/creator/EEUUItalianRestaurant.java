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

import com.pippo.product.EEUUCarbonaraPasta;
import com.pippo.product.EEUUMelanzaneSpadaPasta;
import com.pippo.product.Pasta;

/**
 * Italian restaurant situated in Europe.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * This is a concrete creator as it extends creator abstract class {@link ItalianRestaurant}.
 *
 * Each concrete creator create pasta depending on which product class invoke.
 * It means that if a client requires the same type of pasta on our italian restaurants situated in USA and EEUU, most probably
 * it will be prepared following a different process and the ingredients could not be exactly the same.
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public class EEUUItalianRestaurant extends ItalianRestaurant {

    @Override
    public Pasta createPasta(final String pastaRecipe) {
        if (pastaRecipe.equals(CARBONARA)) {
            return new EEUUCarbonaraPasta();
        }
        else if (pastaRecipe.equals(MELENZANE_AND_SPADA)) {
            return new EEUUMelanzaneSpadaPasta();
        }
        else return null;
    }

}
