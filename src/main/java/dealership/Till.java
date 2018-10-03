package dealership;

public class Till {

    private double money;

    public Till(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void add(double amount){
        this.money += amount;
    }

    public void remove(double amount){
        this.money -= amount;
    }
}
