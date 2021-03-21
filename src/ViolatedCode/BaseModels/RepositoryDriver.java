package ViolatedCode.BaseModels;

import ViolatedCode.Database.DataBase;

public class RepositoryDriver {
    private static DataBase dataBase;

    public RepositoryDriver(){
        if(dataBase == null) {
            dataBase = new DataBase();
        }
    }

    public static DataBase getDataBase() {
        if(dataBase == null) {
            dataBase = new DataBase();
        }
        return dataBase;
    }

    public static void setDataBase(DataBase dataBase) {
        RepositoryDriver.dataBase = dataBase;
    }
}
