import components.ElectricMotor;
import components.Engine;
import components.EngineType;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    Engine engine;
    ElectricMotor electricMotor;
    HybridCar hybridCar;
    ArrayList<Tyre> tyres;


    @Before
    public void setUp(){
        Tyre tyre1 = new Tyre("Michelin", "195/55 R15 V");
        Tyre tyre2 = new Tyre("Michelin", "195/55 R15 V");
        Tyre tyre3 = new Tyre("Michelin", "195/55 R15 V");
        Tyre tyre4 = new Tyre("Michelin", "195/55 R15 V");
        tyres = new ArrayList<>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        engine = new Engine(1200, EngineType.PETROL);
        electricMotor = new ElectricMotor("350V", "170kW");
        hybridCar = new HybridCar("Hyundai", "Ioniq", electricMotor, 12995,
                "Green", "SP17 JKR", "12/03/17", engine, tyres);
    }

    @Test
    public void canBePoweredByMotor(){
        assertEquals(electricMotor, hybridCar.getEngineOrMotor());
    }

    @Test
    public void canBePoweredByEngine(){
        assertEquals(engine, hybridCar.getSecondaryPowerSource());
    }

    @Test
    public void hasMake(){
        assertEquals("Hyundai", hybridCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Ioniq",  hybridCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(12995, hybridCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("Green", hybridCar.getColour());
    }

    @Test
    public void hasRegNumber(){
        assertEquals("SP17 JKR", hybridCar.getRegNumber());
    }

    @Test
    public void hasRegDate(){
        assertEquals("12/03/17", hybridCar.getRegDate());
    }

    @Test
    public void hasFourTyres(){
        assertEquals(4, hybridCar.numberOfTyres());
    }

}
