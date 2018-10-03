package components;

public class Tyre {

    private String manufacturer;
    private String size;

    public Tyre(String manufacturer, String size){
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }
}
