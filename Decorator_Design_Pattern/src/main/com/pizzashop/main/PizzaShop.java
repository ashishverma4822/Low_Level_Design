package main.com.pizzashop.main;

import main.com.pizzashop.base.Pizaa;
import main.com.pizzashop.base.PlainPizza;
import main.com.pizzashop.decorators.Cheese;
import main.com.pizzashop.decorators.Olives;
import main.com.pizzashop.decorators.Pepperoni;

public class PizzaShop {
    public static void main(String[] args) {
        Pizaa pizza = new PlainPizza();
        System.out.println(pizza.getDescription()+ " => R" + pizza.getCost());

        // Add Cheese topping
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription()+ " => R" + pizza.getCost());

        //Add Olives topping
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription()+ " => R"+ pizza.getCost());

        // Add Pepperoni topping
        pizza = new Pepperoni(pizza);
        System.out.println(pizza.getDescription()+ " => R"+ pizza.getCost());

    }
}
