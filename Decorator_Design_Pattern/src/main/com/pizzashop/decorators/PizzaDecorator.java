package main.com.pizzashop.decorators;

import main.com.pizzashop.base.Pizaa;

public abstract class PizzaDecorator implements Pizaa {
    protected Pizaa pizaa;

    public PizzaDecorator(Pizaa pizaa){
        this.pizaa = pizaa;
    }

    @Override
    public String getDescription(){
        return pizaa.getDescription();
    }

    @Override
    public double getCost(){
        return pizaa.getCost();
    }

}
