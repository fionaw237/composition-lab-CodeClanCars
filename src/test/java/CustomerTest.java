import components.ElectricMotor;
import components.Engine;
import components.EngineType;
import components.Tyre;
import dealership.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    ArrayList<Tyre> tyres;
    ElectricMotor electricMotor;
    ElectricCar electricCar;

    @Before
    public void SetUp(){
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
        electricCar = new ElectricCar("Nissan", "Leaf", 16995,
                "Red", "SP18 JKL", "12/06/18", tyres, electricMotor);

        customer = new Customer("A. Customer", "25 Some Street, Some Town", 20000,
                new ArrayList());
        engine = new Engine(1200, EngineType.PETROL);
        car = new Car("Volkswagen", "Polo", 13995, "Silver", "ST18 KLY",
                "04/05/18", tyres, engine);

    }

    @Test
    public void hasName(){
        assertEquals("A. Customer", customer.getName());
    }

    @Test
    public void hasAddress(){
        assertEquals("25 Some Street, Some Town", customer.getAddress());
    }

    @Test
    public void hasFunds(){
        assertEquals(20000, customer.getFunds());
    }

    @Test
    public void canBuyCar(){
        customer.buy(car);
        assertEquals(1, customer.numberOfCarsOwned());
    }

    @Test
    public void canBuyElectricCar(){
        customer.buy(electricCar);
        assertEquals(1, customer.numberOfCarsOwned());
    }

    @Test
    public void buyingCarReducesFunds(){
        customer.buy(car);
        assertEquals(6005, customer.getFunds());
    }

    @Test
    public void cantBuyCarIfNotEnoughFunds(){
        customer.buy(car);
        customer.buy(car);
        assertEquals(6005, customer.getFunds());
        assertEquals(1, customer.numberOfCarsOwned());
    }

    @Test
    public void canBuyTwoDifferentTypesOfCar(){
        Customer customer2 = new Customer("A. Customer", "25 Some Street, Some Town", 40000,
                new ArrayList());
        customer2.buy(car);
        customer2.buy(electricCar);
        assertEquals(2, customer2.numberOfCarsOwned());
        assertEquals(9010, customer2.getFunds());
    }

    @Test
    public void canRentVehicles(){
        customer.rent(car);
        customer.rent(electricCar);
        assertEquals(2, customer.numberOfCarsRenting());
    }

}
