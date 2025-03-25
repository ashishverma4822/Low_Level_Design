package main.com.pizzashop.decorators;

import main.com.pizzashop.base.Pizaa;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizaa pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizaa.getDescription() + ". Cheese";
    }

    @Override
    public double getCost(){
        return pizaa.getCost() + 20.00;
    }

}
