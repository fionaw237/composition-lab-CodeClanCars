import dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp(){
        till = new Till(50000);
    }

    @Test
    public void hasMoney(){
        assertEquals(50000, till.getMoney(), 0.1);
    }

    @Test
    public void canAddMoney(){
        till.add(50.50);
        assertEquals(50050.50, till.getMoney(), 0.01);
    }

    @Test
    public void canRemoveMoney(){
        till.remove(100);
        assertEquals(49900, till.getMoney(), 0.01);
    }
}
