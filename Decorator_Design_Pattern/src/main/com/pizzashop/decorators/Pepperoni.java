package main.com.pizzashop.decorators;

import main.com.pizzashop.base.Pizaa;

public class Pepperoni extends PizzaDecorator{
    public Pepperoni(Pizaa pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizaa.getDescription() + ". Pepperoni";
    }

    @Override
    public double getCost(){
        return pizaa.getCost() + 40.00;
    }

}
