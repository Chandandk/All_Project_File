package DesignPatternsDecorator;

public abstract class Beverage {
    String BeverageName="";
    String getBeverageName(){
        return BeverageName;

    }
    abstract int getPrice();

    }

