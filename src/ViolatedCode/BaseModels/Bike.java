package ViolatedCode.BaseModels;

public class Bike extends Vehicle{
    public Bike(String name, double price) {
        super(name, price);
    }

    public void getTwoWheelerPolicies(){
        System.out.println("these are two wheeler policies");
    }

    public void setNoisySilencer() {
        this.addAdditional("Noisy Silencer");
    }

    public void setLuggageBox() {
        this.addAdditional("Luggage Box");
    }
}
