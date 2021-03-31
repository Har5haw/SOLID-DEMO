package SOLID_Code.Repository;

import SOLID_Code.BaseModels.Vehicle;
import SOLID_Code.DataBase.DataBase;

public class DataRepositoryImpl implements DataRepository{

    private final DataBase dataBase;

    public DataRepositoryImpl(){
        dataBase = new DataBase();
    }

    @Override
    public void placeOrder(Vehicle vehicle) {
        dataBase.insert(vehicle);
    }

    @Override
    public void removeOrder(Vehicle vehicle) {
        dataBase.delete(vehicle);
    }

    @Override
    public void printTheDataBase() {
        System.out.println(dataBase);
    }
}