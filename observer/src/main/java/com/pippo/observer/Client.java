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
package com.pippo.observer;

import com.pippo.observable.Observable;

/**
 * Client of Online Shop.
 *
 * He can subscribe to notification service of Online Shop to be informed when the product he is interested is in stock again.
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * This class is called Observer because it's the entity that subscribe to Observable (Online Shop in our implementation)
 * to be notified when the event it is interested is produced.
 *
 * There are two ways to define Observer:
 *  1. implement Observer interface provided by Java
 *  2. create and implement custom Observer interface
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public class Client implements Observer {

    // reference to Online Shop
    private Observable observable = null;

    // name of client
    private String clientName;

    public Client(final Observable observable, final String clientName) {
        this.observable = observable;
        this.clientName = clientName;
    }

    @Override
    public void update() {
        System.out.println("Client " + this.clientName + " received a notification from Online Shop because the product he is interested is in stock again");
    }

    public String getClientName() {
        return clientName;
    }

}
