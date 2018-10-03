import dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void SetUp(){
        customer = new Customer("A. Customer", "25 Some Street, Some Town", 20000);
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

}
