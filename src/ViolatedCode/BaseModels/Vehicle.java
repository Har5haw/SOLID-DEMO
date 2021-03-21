package ViolatedCode.BaseModels;

import ViolatedCode.Database.DataBase;

import java.util.ArrayList;

public abstract class Vehicle {
    private String name;
    private double price;
    private DataBase dataBase;
    private ArrayList<String> additional;

    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
        this.dataBase = RepositoryDriver.getDataBase();
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

    public void order(){
        dataBase.insert(this);
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
