import components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp(){
        tyre = new Tyre("Michelin", "195/55 R15 V");
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Michelin", tyre.getManufacturer());
    }

    @Test
    public void hasSize(){
        assertEquals("195/55 R15 V", tyre.getSize());
    }
}
