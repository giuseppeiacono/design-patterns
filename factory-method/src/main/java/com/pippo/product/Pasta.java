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
package com.pippo.product;

/**
 * Pasta available on our restaurants in EEUU and USA.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * This is the abstract product class that should be extended by all concrete products.
 *
 * It's totally decoupled from concrete product because it have no idea how is prepared each plate of pasta. It is
 * delegated to concrete product at runtime.
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public abstract class Pasta {

    String name;
    String formatOfPasta;
    String sauce;

    public void prepare() {
        System.out.println("Preparing pasta " + formatOfPasta);
        System.out.println("Preparing condiment: " + sauce);
        System.out.println("Toss pasta and condiment in a pan for about 1 minute");
    }

    public void putInPlate() {
        System.out.println("Put " + name + " on a plate");
    }

    public void setName(final String name) {
        this.name = name;
    }

}
