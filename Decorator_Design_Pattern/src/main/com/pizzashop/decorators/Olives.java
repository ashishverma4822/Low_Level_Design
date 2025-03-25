package main.com.pizzashop.decorators;

import main.com.pizzashop.base.Pizaa;

public class Olives extends PizzaDecorator{
    public Olives(Pizaa pizaa){
        super(pizaa);
    }

    @Override
    public String getDescription(){
        return pizaa.getDescription() + ". Olives";
    }

    @Override
    public double getCost(){
        return pizaa.getCost() + 30.00;
    }

}
