package com.pippo.observable;

import com.pippo.observable.OnlineShop;
import com.pippo.observer.Client;
import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Client tests.
 *
 * @author Giuseppe Iacono
 */
public class ClientTest {

    private OnlineShop onlineShop;
    private Client client1;

    @Test
    public void testUpdate_whenProductIsInStockAgain_thenClientIsNotifiedByOnlineShop() {
        onlineShop = new OnlineShop();
        OnlineShop onlineShopSpy = spy(onlineShop);
        client1 = new Client(onlineShop, "Jack");
        Client client1Spy = spy(client1);

        // test
        onlineShopSpy.addObserver(client1Spy);
        onlineShopSpy.setProductInStock(true);

        // assertions
        verify(client1Spy, times(1)).update();
    }

}
