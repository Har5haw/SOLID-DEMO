package SOLID_Code.Driver;

import SOLID_Code.BaseModels.*;
import SOLID_Code.Repository.DataRepository;
import SOLID_Code.VehicleModels.FourWheelVehicle;
import SOLID_Code.VehicleModels.TwoWheelVehicle;

public class DriverMain {
    public static void main(String[] args) {

        FourWheelVehicle car = new Car("BMW", 12000);
        FourWheelVehicle lorry = new Lorry("TATA", 1200000);
        TwoWheelVehicle bike = new Bike("Honda", 1200);

        bike.getTwoWheelerPolicies();
        lorry.getFourWheelerPolicies();

        lorry.setAdvancedMusicPlayer();
        lorry.setRefrigerator();

        bike.setNoisySilencer();
        bike.setLuggageBox();

        DataRepository dataRepository = RepositoryDriver.getDataRepository();
        dataRepository.placeOrder(car);
        dataRepository.placeOrder(lorry);
        dataRepository.placeOrder(bike);



        System.out.println("\n\n----------database records-----------\n\n");
        RepositoryDriver repositoryDriver = new RepositoryDriver();
        repositoryDriver.print();

    }
}
