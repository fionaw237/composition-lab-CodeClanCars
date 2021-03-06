import components.ElectricMotor;
import components.Engine;
import components.EngineType;
import components.Tyre;
import dealership.Customer;
import dealership.Dealer;
import dealership.Dealership;
import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Dealer dealer;
    Till till;
    Customer customer1;
    Customer customer2;
    ArrayList<Customer> customers;
    Car car1;
    Car car2;
    HybridCar hybridCar1;
    HybridCar hybridCar2;
    ElectricCar electricCar1;
    ElectricCar electricCar2;
    ArrayList<Vehicle> vehicles;
    ArrayList<Tyre> tyres;
    ElectricMotor electricMotor;
    Engine engine;

    @Before
    public void setUp(){
        dealer = new Dealer("Car Seller");

        till = new Till(50000);
        customer1 = new Customer("A. Customer", "25 Some Street, Some Town", 20000, new ArrayList<>());
        customer2 = new Customer("B. Customer", "25 Some Street, Some Town", 10000, new ArrayList<>());
        customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        Tyre tyre1 = new Tyre("Michelin", "195/55 R15 V");
        Tyre tyre2 = new Tyre("Michelin", "195/55 R15 V");
        Tyre tyre3 = new Tyre("Michelin", "195/55 R15 V");
        Tyre tyre4 = new Tyre("Michelin", "195/55 R15 V");
        tyres = new ArrayList<>();
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);

        electricMotor = new ElectricMotor("350V", "170kW");

        electricCar1 = new ElectricCar("Nissan", "Leaf", 16995,
                "Red", "SP18 JKL", "12/06/18", tyres, electricMotor);
        electricCar2 = new ElectricCar("Nissan", "Leaf", 15995,
                "Blue", "SP18 JKL", "12/06/18", tyres, electricMotor);

        vehicles = new ArrayList<>();

        vehicles.add(electricCar1);
        vehicles.add(electricCar2);

        engine = new Engine(1200, EngineType.PETROL);

        car1 = new Car("Volkswagen", "Polo", 13995, "Silver",
                "ST18 KLY", "04/05/18", tyres, engine);
        car2 = new Car("Volkswagen", "Polo", 14995, "Black", "ST18 KLY",
                "04/05/18", tyres, engine);
        vehicles.add(car1);
        vehicles.add(car2);


        hybridCar1 = new HybridCar("Hyundai", "Ioniq", 12995,
                "Green", "SP17 JKR", "12/03/17", tyres, engine, electricMotor);
//        hybridCar2 = new HybridCar("Hyundai", "Ioniq", electricMotor, 11995,
//                "Yellow", "SP17 JKR", "12/03/17", engine, tyres);
        vehicles.add(hybridCar1);
//        vehicles.add(hybridCar2);

        dealership = new Dealership(dealer, till, vehicles, customers);
    }

    @Test
    public void has2StandardCars(){
        assertEquals(2, dealership.numberOfCars());
    }

    @Test
    public void has1HybridCar(){
        assertEquals(1, dealership.numberOfHybridCars());
    }

    @Test
    public void has2ElectricCars(){
        assertEquals(2, dealership.numberOfElectricCars());
    }

    @Test
    public void hasTill(){
        assertEquals(till, dealership.getTill());
    }

    @Test
    public void hasDealer(){
        assertEquals(dealer, dealership.getDealer());
    }

    @Test
    public void canSellVehicle(){
        dealership.sell(car1, customer1);
        assertEquals(1, customer1.numberOfCarsOwned());
        assertEquals(1, dealership.numberOfCars());
    }
}
