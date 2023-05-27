package config;

import persistance.DummyDB;

public class MenuManager {

    DummyDB dummyDB;

    public MenuManager() {
        dummyDB = new DummyDB();
        //dummyDB.initDB();
    }

    public void printMenu() {
        System.out.println("****** MENU ******");
    }
}
