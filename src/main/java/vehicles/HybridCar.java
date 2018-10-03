package vehicles;

import components.Tyre;
import interfaces.CanPowerVehicle;

import java.util.ArrayList;

public class HybridCar extends Vehicle{

    private CanPowerVehicle secondaryPowerSource;

    public HybridCar(String make, String model, CanPowerVehicle poweredBy, int price, String colour,
                     String regNumber, String regDate, CanPowerVehicle secondaryPowerSource,
                     ArrayList<Tyre> tyres) {
        super(make, model, poweredBy, price, colour, regNumber, regDate, tyres);
        this.secondaryPowerSource = secondaryPowerSource;
    }

    public CanPowerVehicle getSecondaryPowerSource() {
        return secondaryPowerSource;
    }
}
