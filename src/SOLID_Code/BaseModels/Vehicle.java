package SOLID_Code.BaseModels;
import SOLID_Code.Repository.DataRepository;

import java.util.ArrayList;

public abstract class Vehicle {
    private String name;
    private double price;
    private final ArrayList<String> additional;

    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
        additional = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getAdditional() {
        return additional;
    }

    public void addAdditional(String additional) {
        if(!this.additional.contains(additional)){
            this.additional.add(additional);
        }
    }
}
