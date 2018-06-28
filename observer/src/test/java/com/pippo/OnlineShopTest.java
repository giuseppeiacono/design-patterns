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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Online Shop tests.
 *
 * @author Giuseppe Iacono
 */
public class OnlineShopTest {

    private OnlineShop onlineShop;
    private Client client1;
    private Client client2;

    @Before
    public void setUp() {
        onlineShop = new OnlineShop();
        client1 = new Client(onlineShop, "Jack");
        client2 = new Client(onlineShop, "Pamela");
    }

    @Test
    public void testAddObserver_whenClientSubscribeToNotificationService_thenHeIsAddedToListOfClientToNotifyWhenProductIsInStock() {
        // test
        onlineShop.addObserver(client1);

        // assertions
        assertClientWasSubscribedToOnlineShopNotificationService(client1);
    }

    @Test
    public void testRemoveObserver_whenClientUnsubscribeFromNotificationService_thenHeWasRemovedFromListOfClientToNotifyWhenProductIsInStock() {
        onlineShop.addObserver(client1);
        assertClientWasSubscribedToOnlineShopNotificationService(client1);

        // test
        onlineShop.removeObserver(client1);

        // assertions
        assertTrue("The list of clients which should be notified when the product is in stock should be empty",onlineShop.getClientToNotifyList().size() == 0);
    }

    @Test
    public void testNotifyObservers_whenThereAreObserversSubscribedToOnlineShopAndProductIsInStock_thenAllObserversAreNotified() {
        OnlineShop onlineShopSpy = spy(onlineShop);
        Client client1Spy = spy(client1);
        Client client2Spy = spy(client2);

        // subscribe clients to Online Shop notification service
        onlineShopSpy.addObserver(client1Spy);
        onlineShopSpy.addObserver(client2Spy);

        // test
        onlineShopSpy.setProductInStock(true);

        // assertions
        verify(onlineShopSpy, times(1)).notifyObservers();
        verify(client1Spy, times(1)).update();
        verify(client2Spy, times(1)).update();
    }

    private void assertClientWasSubscribedToOnlineShopNotificationService(final Client expectedClient) {
        Client clientSubscribed = (Client) onlineShop.getClientToNotifyList().get(0);
        assertTrue("The list of clients which should be notified when the product is in stock should not be empty",onlineShop.getClientToNotifyList().size() > 0);
        assertEquals("The list of clients which should be notified when the product is in stock should include client " + expectedClient.getClientName(), expectedClient.getClientName(), clientSubscribed.getClientName());
    }

}
