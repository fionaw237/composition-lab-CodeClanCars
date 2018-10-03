import dealership.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setUp(){
        dealer = new Dealer("Car Seller");
    }

    @Test
    public void hasName(){
        assertEquals("Car Seller", dealer.getName());
    }
}
