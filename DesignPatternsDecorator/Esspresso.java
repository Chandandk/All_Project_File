package DesignPatternsDecorator;

public class Esspresso extends Beverage {
    public Esspresso(){
        this.BeverageName="Esspresso Coffee"+" ";

    }
    @Override
    int getPrice(){
        return 15;
    }
    
    
}
