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
package com.pippo;

import java.util.ArrayList;
import java.util.List;

/**
 * Online shop that offers notification service to registered clients that are waiting for products currently out of stock.
 *
 *  1. this service works only for clients that were registered invoking {@link #addObserver(Observer)} method
 *  2. each registered client can unsubscribe from this service at any time invoking {@link #removeObserver(Observer)} method
 *  3. each registered client is notified when products they are interested are in stock again
 *
 * --------------------------------------------------------------------------------------------------------------------------
 * PATTERN NOTES:
 *
 * This class is called Observable because it's the entity from which registered Observers (clients in our implementation)
 * are waiting for notification to perform an action.
 *
 * There are two ways to define Observable:
 *  1. implement Observable interface provided by Java
 *  2. create and implement custom Observable interface
 * --------------------------------------------------------------------------------------------------------------------------
 *
 * @author Giuseppe Iacono
 */
public class OnlineShop implements Observable {

    // list of clients to notify
    private List<Observer> clientToNotifyList = new ArrayList<>();

    // state of product
    private boolean productInStock = false;

    @Override
    public void addObserver(final Observer client) {
        clientToNotifyList.add(client);
        System.out.println("Online Shop: new client was subscribed to notification service");
    }

    @Override
    public void removeObserver(final Observer client) {
        clientToNotifyList.remove(client);
        System.out.println("Online Shop: client was unsubscribed from notification service");
    }

    @Override
    public void notifyObservers() {
        for (Observer client : clientToNotifyList) {
            client.update();
            Client clientNotified = (Client) client;
            System.out.println("Online Shop: client " + clientNotified.getClientName() + " was notified");
        }
    }

    /**
     * Setter of {@code productInStock}
     *
     * @param productInStock true if the product is in stock, else false
     */
    public void setProductInStock(boolean productInStock) {
        this.productInStock = productInStock;

        // notify all observers if the product is in stock again
        if (productInStock) {
            System.out.println("Online Shop: the product is in stock");
            notifyObservers();
        }
        else {
            System.out.println("Online Shop: the product is out of stock");
        }
    }

    public List<Observer> getClientToNotifyList() {
        return clientToNotifyList;
    }

}
