import components.EngineType;
import components.Tyre;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import components.Engine;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
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
        car = new Car("Volkswagen", "Polo", 13995, "Silver",
                "ST18 KLY", "04/05/18", tyres, engine);
    }

    @Test
    public void poweredByEngine(){
        assertEquals(engine, car.getEngine());
    }
//
//    @Test
//    public void hasMake(){
//        assertEquals("Volkswagen", car.getMake());
//    }
//
//    @Test
//    public void hasModel(){
//        assertEquals("Polo",  car.getModel());
//    }
//
//    @Test
//    public void hasPrice(){
//        assertEquals(13995, car.getPrice());
//    }
//
//    @Test
//    public void hasColour(){
//        assertEquals("Silver", car.getColour());
//    }
//
//    @Test
//    public void hasRegNumber(){
//        assertEquals("ST18 KLY", car.getRegNumber());
//    }
//
//    @Test
//    public void hasRegDate(){
//        assertEquals("04/05/18", car.getRegDate());
//    }
//
//    @Test
//    public void hasFourTyres(){
//        assertEquals(4, car.numberOfTyres());
//    }

}
