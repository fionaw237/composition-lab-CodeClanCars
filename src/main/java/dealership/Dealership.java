package dealership;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private Dealer dealer;
    private Till till;
    private ArrayList<Car> cars;
    private ArrayList<ElectricCar> electricCars;
    private ArrayList<HybridCar> hybridCars;
    private ArrayList<Customer> customers;

    public Dealership(Dealer dealer, Till till, ArrayList<Car> cars, ArrayList<ElectricCar> electricCars,
                      ArrayList<HybridCar> hybridCars, ArrayList<Customer> customers) {
        this.dealer = dealer;
        this.till = till;
        this.cars = cars;
        this.electricCars = electricCars;
        this.hybridCars = hybridCars;
        this.customers = customers;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Till getTill() {
        return till;
    }

    public int numberOfCars(){
        return this.cars.size();
    }

    public int numberOfElectricCars(){
        return this.electricCars.size();
    }

    public int numberOfHybridCars(){
        return this.hybridCars.size();
    }

//    public void sell(Vehicle vehicle, Customer customer) {
//        customer.buy(vehicle);
//        this.
//    }
}
