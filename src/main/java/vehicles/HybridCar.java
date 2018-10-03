package vehicles;

import components.ElectricMotor;
import components.Engine;
import components.Tyre;
import interfaces.CanPowerVehicle;

import java.util.ArrayList;

public class HybridCar extends Vehicle{

    private Engine engine;
    private ElectricMotor electricMotor;

    public HybridCar(String make, String model, int price, String colour,
                     String regNumber, String regDate,
                     ArrayList<Tyre> tyres, Engine engine, ElectricMotor electricMotor) {
        super(make, model, price, colour, regNumber, regDate, tyres);
        this.engine = engine;
        this.electricMotor = electricMotor;
    }

    public Engine getEngine() {
        return engine;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }
}
