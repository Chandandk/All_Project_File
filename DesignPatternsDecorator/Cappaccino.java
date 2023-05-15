package DesignPatternsDecorator;

public class Cappaccino extends Beverage {
    public Cappaccino(){
        this.BeverageName="Cappaccino Coffee"+" ";
}
    @Override
    int getPrice(){
    return 12;
}
}
