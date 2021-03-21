package SOLID_Code.DataBase;

import SOLID_Code.BaseModels.Vehicle;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Vehicle> vehicleArrayList;
    public DataBase(){
        vehicleArrayList = new ArrayList<>();
    }
    public void insert(Vehicle vehicle){
        vehicleArrayList.add(vehicle);
    }
    public void delete(Vehicle vehicle){
        vehicleArrayList.remove(vehicle);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for(Vehicle vehicle : vehicleArrayList){
            stringBuffer.append("Name: ");
            stringBuffer.append(vehicle.getName());
            stringBuffer.append(" Price: ");
            stringBuffer.append(vehicle.getPrice());
            ArrayList<String> additionalList = vehicle.getAdditional();
            if(additionalList.size() > 0){
                int i = 0;
                stringBuffer.append(" with ");
                for(String additional : additionalList){
                    stringBuffer.append(additional);
                    if(i++ != additionalList.size() - 1){
                        stringBuffer.append(",");
                    }
                }
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
