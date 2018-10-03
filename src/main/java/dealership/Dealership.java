package dealership;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private Dealer dealer;
    private Till till;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Customer> customers;

    public Dealership(Dealer dealer, Till till, ArrayList<Vehicle> vehicles, ArrayList<Customer> customers) {
        this.dealer = dealer;
        this.till = till;
        this.vehicles = vehicles;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Till getTill() {
        return till;
    }

    public int numberOfCars(){
        int total = 0;
        for (Vehicle vehicle : this.vehicles){
            if (vehicle instanceof Car){
                total ++;
            }
        }
        return total;
    }

    public int numberOfElectricCars(){
        int total = 0;
        for (Vehicle vehicle : this.vehicles){
            if (vehicle instanceof ElectricCar){
                total ++;
            }
        }
        return total;
    }

    public int numberOfHybridCars(){
        int total = 0;
        for (Vehicle vehicle : this.vehicles){
            if (vehicle instanceof HybridCar){
                total ++;
            }
        }
        return total;
    }

    public void sell(Vehicle vehicle, Customer customer) {
        customer.buy(vehicle);
        this.vehicles.remove(vehicle);
    }
}
