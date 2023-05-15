import java.util.*;

public class table {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
           
            System.out.println("Enter no to print table");
             int tar =sc.nextInt(); 
      // Run this code in two ways using while loop
            // while(j<=10){
            //     System.out.println(i*j);
            //     j=j+1;

               // Run this code in two ways using for loop
                 for(int j=1;j<=10;j++){
                     System.out.println(tar+"X"+j+"= "+tar*j+" ");
               // }
            }
         
           
        }

      
    }
}
