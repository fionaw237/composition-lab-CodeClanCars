import components.ElectricMotor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricMotorTest {

    ElectricMotor electricMotor;

    @Before
    public void setUp(){
        electricMotor = new ElectricMotor("350V", "170kW");
    }

    @Test
    public void hasVoltage(){
        assertEquals("350V", electricMotor.getVoltage());
    }

    @Test
    public void hasPower(){
        assertEquals("170kW", electricMotor.getPower());
    }
}
