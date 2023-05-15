import java.util.*;
public class AdditionofArray {
  public static void main(String[]args){
    int a[]=new int[5]; int sum=0;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("\nEnter elements of Array");
       for(int i=0;i<=a.length-1;i++){
          a[i]=sc.nextInt();
      }
    }
for(int i=0;i<=a.length-1;i++){
    System.out.println(a[i]);
    sum=a[i]+sum;
}
    System.out.println(sum);
}
  }


