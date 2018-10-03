import components.ElectricMotor;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricMotor electricMotor;
    ElectricCar electricCar;
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
        electricMotor = new ElectricMotor("350V", "170kW");
        electricCar = new ElectricCar("Nissan", "Leaf", electricMotor, 16995,
                "Red", "SP18 JKL", "12/06/18", tyres);
    }

    @Test
    public void poweredByMotor(){
        assertEquals(electricMotor, electricCar.getEngineOrMotor());
    }

    @Test
    public void hasMake(){
        assertEquals("Nissan", electricCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Leaf",  electricCar.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(16995, electricCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", electricCar.getColour());
    }

    @Test
    public void hasRegNumber(){
        assertEquals("SP18 JKL", electricCar.getRegNumber());
    }

    @Test
    public void hasRegDate(){
        assertEquals("12/06/18", electricCar.getRegDate());
    }

    @Test
    public void hasFourTyres(){
        assertEquals(4, electricCar.numberOfTyres());
    }


}
