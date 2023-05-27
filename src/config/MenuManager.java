package config;

import model.foodItem.pizza.Pizza;
import persistance.DummyDB;

public class MenuManager {

    DummyDB dummyDB;

    public MenuManager() {
        dummyDB = new DummyDB();
        dummyDB.initDB();
    }

    public void printMenu() {
        System.out.println("****** MENU ******");

        for (Pizza pizza : dummyDB.getMenuPizza()) {
            System.out.println(pizza.getMenuItemLine());
        }
    }
}
