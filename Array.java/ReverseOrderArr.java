import java.util.Scanner;
public class ReverseOrderArr {
  public static void main(String[]args){
    try (Scanner sc = new Scanner(System.in)) {
      int size=sc.nextInt();
        int a[]=new int[size];

         System.out.println("\nEnter elements of Array");   
         for(int i=0;i<size;i++){    // input side
              a[i]=sc.nextInt();
          }
         
System.out.println("\nOrignal order array :");
for(int i=0;i<size;i++){
        System.out.print(a[i]+" ");
      }

           
System.out.println("\nReverse order array :");
for(int i=size-1;i>=0;i--){
        System.out.print(a[i]+" ");
      }
    }
   }

}
 
