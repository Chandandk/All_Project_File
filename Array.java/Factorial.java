//import java.util.*;

public class Factorial {
public static void main(String[] args) {
    int n=5;
    PrintInc(n);
    // Scanner r= new Scanner(System.in);
    System.out.print(" Enter the number to be Factorial");
        // int n=r.nextInt();
    }
    public static int fact(int n) {
        if(n==1)
        return;
 }
 int faith=fact(n-1);
 int ans=n*faith;
 System.out.println(ans);
 return ans;
}
