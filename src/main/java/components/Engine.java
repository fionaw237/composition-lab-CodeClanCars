package components;

import interfaces.CanPowerVehicle;

public class Engine implements CanPowerVehicle{
    private int capacity;
    private EngineType type;

    public Engine(int capacity, EngineType type){
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public EngineType getType() {
        return type;
    }
}
