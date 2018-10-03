package components;

import interfaces.CanPowerVehicle;

public class ElectricMotor implements CanPowerVehicle{

    private String voltage;
    private String power;

    public ElectricMotor(String voltage, String power){
        this.voltage = voltage;
        this.power = power;
    }

    public String getVoltage() {
        return voltage;
    }

    public String getPower() {
        return power;
    }
}
