import java.util.*;
public class SmallestArr{
    public static void main(String[]agrs){
        try (Scanner sc = new Scanner(System.in)) {
            int a[]=new int[5]; int min; 

            for(int i=0;i<=a.length-1;i++){
                a[i]=sc.nextInt();
 }
 min=a[0];
System.out.println("Array Elements");

for(int i=0;i<=a.length-1;i++){
   
   if(a[i]<min){
            min=a[i];
   }
}
   System.out.print("Smallest number in Array Element :"+min);
        }
    
    }
}
    
