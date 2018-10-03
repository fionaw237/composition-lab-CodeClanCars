package dealership;

public class Customer {

    private String name;
    private String address;
    private int funds;

    public Customer(String name, String address, int funds) {
        this.name = name;
        this.address = address;
        this.funds = funds;
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
}
