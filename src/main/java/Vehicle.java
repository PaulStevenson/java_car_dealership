import com.sun.org.apache.xpath.internal.operations.Mod;

import eNums.Type;

public class Vehicle {
    
    private Type type;
    private  String make;
    private String model;
    private double price;
    private String colour;
    
    public Vehicle(Type type, String make, String model, double price, String colour){
        this.type = type;
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public Type getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
