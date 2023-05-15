package DesignPatternsDecorator;

public class Caramel extends IngredientDecorator {
    Beverage baseBeverage;
    public Caramel(Beverage baseBeverage){
        this.baseBeverage=baseBeverage;
}
@Override
int getPrice(){
    return baseBeverage.getPrice()+3;
}
@Override
String getBeverageName(){
    return baseBeverage.BeverageName+ "With Caramel";
}
}