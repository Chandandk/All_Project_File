package DesignPatternsDecorator;

public class Milk extends IngredientDecorator {
    Beverage baseBeverage;
    public Milk(Beverage baseBeverage){
        this.baseBeverage=baseBeverage;
}
@Override
int getPrice(){
    return baseBeverage.getPrice()+2;
}
@Override
String getBeverageName(){
    return baseBeverage.BeverageName+ "With Milk";
}
}
