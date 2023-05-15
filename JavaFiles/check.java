package JavaFiles;
public interface CustomerRaju {
    int amt=5;
    void Purchase();
}
class SellerSanju implements CustomerRaju{
@Override
    public void Purchase(){
    System.out.println("Raju need"+" "+amt+" "+"Kg of Rice");
}
}
public class check{
    public static void main(String[] args) {
        CustomerRaju r=new SellerSanju();
        r.Purchase();
    }
}