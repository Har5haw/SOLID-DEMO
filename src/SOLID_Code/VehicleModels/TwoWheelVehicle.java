package SOLID_Code.VehicleModels;

import SOLID_Code.Installations.TwoWheelerAdditional;
import SOLID_Code.BaseModels.Vehicle;
import SOLID_Code.VehicleTypes.TwoWheeler;

public abstract class TwoWheelVehicle extends Vehicle implements TwoWheeler, TwoWheelerAdditional {

    private final String twoWheelerPolicies;
    public TwoWheelVehicle(String name, double price) {
        super(name, price);
        twoWheelerPolicies = "These are two wheeler policies";
    }

    @Override
    public void getTwoWheelerPolicies() {
        System.out.println(twoWheelerPolicies);
    }

    @Override
    public void setNoisySilencer() {
        this.addAdditional("Noisy Silencer");
    }

    @Override
    public void setLuggageBox() {
        this.addAdditional("Luggage Box");
    }
}
