package vehicles;

import components.ElectricMotor;
import components.Tyre;
import interfaces.CanPowerVehicle;

import java.util.ArrayList;

public class ElectricCar extends Vehicle{

    ElectricMotor electricMotor;

    public ElectricCar(String make, String model, int price, String colour, String regNumber, String regDate,
                       ArrayList<Tyre> tyres, ElectricMotor electricMotor) {
        super(make, model, price, colour, regNumber, regDate, tyres);
        this.electricMotor = electricMotor;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }
}
