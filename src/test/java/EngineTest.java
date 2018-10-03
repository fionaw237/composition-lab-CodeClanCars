import components.Engine;
import components.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(1200, EngineType.PETROL);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1200, engine.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals(EngineType.PETROL, engine.getType());
    }
}
