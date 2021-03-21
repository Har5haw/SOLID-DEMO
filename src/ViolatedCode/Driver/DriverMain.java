package ViolatedCode.Driver;

import ViolatedCode.BaseModels.Bike;
import ViolatedCode.BaseModels.Car;
import ViolatedCode.BaseModels.RepositoryDriver;
import ViolatedCode.BaseModels.Vehicle;

public class DriverMain {
    public static void main(String[] args) {
        Car car = new Car("BMW", 1200);
        Bike bike = new Bike("Honda", 120000);

        car.getFourWheelerPolicies();

        Vehicle car1 = new Car("BMW", 129999);

        car1.order();

        System.out.println(RepositoryDriver.getDataBase());
    }
}
