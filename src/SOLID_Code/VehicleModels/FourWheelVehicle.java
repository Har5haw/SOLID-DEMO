package SOLID_Code.VehicleModels;

import SOLID_Code.Installations.FourWheelerAdditional;
import SOLID_Code.BaseModels.Vehicle;
import SOLID_Code.VehicleTypes.FourWheeler;

public abstract class FourWheelVehicle extends Vehicle implements FourWheeler, FourWheelerAdditional {

    private String fourWheelerPolicies;

    public FourWheelVehicle(String name, double price) {
        super(name, price);
        fourWheelerPolicies = "These are four wheeler policies";
    }

    @Override
    public void getFourWheelerPolicies() {
        System.out.println(fourWheelerPolicies);
    }

    @Override
    public void setAdvancedMusicPlayer() {
        this.addAdditional("Advanced Music Player");
    }

    @Override
    public void setRefrigerator() {
        this.addAdditional("Refrigerator");
    }
}
