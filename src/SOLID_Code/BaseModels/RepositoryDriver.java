package SOLID_Code.BaseModels;

import SOLID_Code.Repository.DataRepository;
import SOLID_Code.Repository.DataRepositoryImpl;

public class RepositoryDriver {

    private static DataRepository dataRepository;

    public RepositoryDriver(){
        if(dataRepository == null) {
            dataRepository = new DataRepositoryImpl();
        }
    }

    public static DataRepository getDataRepository() {

        if(dataRepository == null) {
            dataRepository = new DataRepositoryImpl();
        }
        return dataRepository;
    }

    public void print(){
        dataRepository.printTheDataBase();
    }
}
