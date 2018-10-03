package vehicles;

import components.Tyre;
import interfaces.CanPowerVehicle;

import java.util.ArrayList;

public class Car extends Vehicle{

    public Car(String make, String model, CanPowerVehicle poweredBy, int price, String colour,
               String regNumber, String regDate, ArrayList<Tyre> tyres){
        super(make, model, poweredBy, price, colour, regNumber, regDate, tyres);
    }

}
