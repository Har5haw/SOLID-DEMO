package SOLID_Code.Repository;

import SOLID_Code.BaseModels.Vehicle;

public interface DataRepository {
    void placeOrder(Vehicle vehicle);
    void removeOrder(Vehicle vehicle);
    void printTheDataBase();
}
