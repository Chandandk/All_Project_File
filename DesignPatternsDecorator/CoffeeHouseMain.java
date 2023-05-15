package DesignPatternsDecorator;

public class CoffeeHouseMain {
    public static void main(String[] args) {
        Beverage es=new Esspresso();
        es =new Milk(es);
        es =new Caramel(es);
        System.out.println(es.getBeverageName()+" "+"has Price"+" "+es.getPrice());

        // Beverage cap=new Cappaccino();
        // cap =new Milk(cap);
        // cap=new Caramel(cap);
        // System.out.println(cap.getBeverageName()+" "+"has Price"+" "+cap.getPrice());
    }
}
