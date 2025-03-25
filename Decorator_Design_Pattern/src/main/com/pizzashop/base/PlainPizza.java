package main.com.pizzashop.base;

public class PlainPizza implements Pizaa{
    @Override
    public String getDescription(){
        return "Plain Pizza";
    }

    @Override
    public double getCost(){
        return 100.00;
    }

}
