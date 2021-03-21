package ViolatedCode.BaseModels;

public class Car extends Vehicle{
    public Car(String name, double price) {
        super(name, price);
    }

    public void getFourWheelerPolicies(){
        System.out.println("these are four wheeler policies");
    }

    public void setAdvancedMusicPlayer() {
        this.addAdditional("Advanced Music Player");
    }

    public void setRefrigerator() {
        this.addAdditional("Refrigerator");
    }
}
