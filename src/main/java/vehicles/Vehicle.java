package vehicles;

import components.Tyre;
import interfaces.CanPowerVehicle;

import java.util.ArrayList;

public abstract class Vehicle {

    private String make;
    private String model;
    private CanPowerVehicle poweredBy;
    private int price;
    private String colour;
    private String regNumber;
    private String regDate;
    private ArrayList<Tyre> tyres;


    public Vehicle(String make, String model, CanPowerVehicle poweredBy, int price, String colour,
                   String regNumber, String regDate, ArrayList<Tyre> tyres){
        this.make = make;
        this.model = model;
        this.poweredBy = poweredBy;
        this.price = price;
        this.colour = colour;
        this.regNumber = regNumber;
        this.regDate = regDate;
        this.tyres = tyres;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public CanPowerVehicle getEngineOrMotor(){
        return poweredBy;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getRegDate() {
        return regDate;
    }

    public int numberOfTyres() {
        return tyres.size();
    }

    //    public void addDamage(){
//
//    }

}
