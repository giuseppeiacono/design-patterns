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

import com.pippo.product.Pasta;

/**
 * Italian Restaurant.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * This is the abstract creator class that should be extended by all concrete creators.
 *
 * It's totally decoupled from concrete creators because it have no idea what real class is involved to create pasta. It is
 * delegated to concrete creator at runtime.
 *
 * The method {@code createPasta} is the factory method implemented by each concrete creator to create pasta following the
 * process and using the ingredients of specific restaurant.
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public abstract class ItalianRestaurant {

    // Types of pasta offered by our Italian restaurants in EEUU
    public static final String CARBONARA = "Carbonara";
    public static final String MELENZANE_AND_SPADA = "MelanzaneSpada";

    /**
     * Prepare the plate of pasta required by client following the process established by specific italian restaurant.
     *
     * @param pastaRecipe the recipe of pasta to prepare
     * @return the plate of pasta required by client
     */
    public Pasta orderPasta(final String pastaRecipe) {
        Pasta pasta = createPasta(pastaRecipe);
        pasta.prepare();
        pasta.putInPlate();

        return pasta;
    }

    /**
     * Create pasta required by client.
     *
     * @param pastaRecipe the recipe of pasta to prepare
     * @return pasta
     */
    public abstract Pasta createPasta(final String pastaRecipe);

}
