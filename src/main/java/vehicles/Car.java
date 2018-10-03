package vehicles;

import components.Engine;
import components.Tyre;

import java.util.ArrayList;

public class Car extends Vehicle{

    private Engine engine;

    public Car(String make, String model, int price, String colour,
               String regNumber, String regDate, ArrayList<Tyre> tyres, Engine engine){
        super(make, model, price, colour, regNumber, regDate, tyres);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
