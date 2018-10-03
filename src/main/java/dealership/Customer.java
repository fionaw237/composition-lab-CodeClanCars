package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String address;
    private int funds;
    private ArrayList<Vehicle> cars;
    private ArrayList<Vehicle> rentalCars;


    public Customer(String name, String address, int funds, ArrayList<Vehicle> cars) {
        this.name = name;
        this.address = address;
        this.funds = funds;
        this.cars = cars;
        this.rentalCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getFunds() {
        return funds;
    }

    public int numberOfCarsOwned(){
        return this.cars.size();
    }

    public void buy(Vehicle vehicle){
        if (canAfford(vehicle)){
            this.cars.add(vehicle);
            payForVehicle(vehicle);
        }
    }

    public void payForVehicle(Vehicle vehicle){
        this.funds -= vehicle.getPrice();
    }

    public boolean canAfford(Vehicle vehicle){
        return this.funds >= vehicle.getPrice();
    }


    public void rent(Vehicle vehicle){
        this.rentalCars.add(vehicle);
    }

    public int numberOfCarsRenting(){
        return this.rentalCars.size();
    }
}
