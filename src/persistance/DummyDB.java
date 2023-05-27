package persistance;

import model.foodItem.drink.Drink;
import model.foodItem.pizza.Pizza;
import model.foodItem.pizza.PizzaFamilySize;
import model.foodItem.pizza.PizzaTopping.PizzaTopping;
import model.foodItem.pizza.pizzaBase.PizzaHawaiian;
import model.foodItem.pizza.pizzaBase.PizzaMargherita;
import model.foodItem.pizza.pizzaBase.PizzaSalami;
import model.franchisingItem.Franchising;

import java.util.ArrayList;
import java.util.List;

public class DummyDB {

    private final List<Pizza> menuPizza = new ArrayList<>();
    private final List<PizzaTopping> menuTopping = new ArrayList<>();
    private final List<Drink> menuDrink = new ArrayList<>();
    private final List<Franchising> menuFranchising = new ArrayList<>();

    public List<Pizza> getMenuPizza() {
        return menuPizza;
    }

    public List<PizzaTopping> getMenuTopping() {
        return menuTopping;
    }

    public List<Drink> getMenuDrink() {
        return menuDrink;
    }

    public List<Franchising> getMenuFranchising() {
        return menuFranchising;
    }

    public void initDB() {

        menuPizza.add(new PizzaMargherita());
        menuPizza.add(new PizzaHawaiian());
        menuPizza.add(new PizzaSalami());
        menuPizza.add(new PizzaFamilySize(new PizzaMargherita()));
    }
}
