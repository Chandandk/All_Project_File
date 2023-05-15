import java.util.*;
public class OneDArray {
    public static void main (String[] args){
  try (Scanner sc = new Scanner(System.in)) {
    int size=sc.nextInt();
    int numbers[]=new int[size];

    //input
 for(int i=0;i<size;i++){
numbers[i]=sc.nextInt();
}

System.out.print("Enter the number you want to search user defined input :");


// output
int x= sc.nextInt();
for(int i=0;i<numbers.length;i++){
if(numbers[i]== x){   

System.out.println("X found at index "+i);
}
}
  }
}
}



       // int arr[]= new int[10];
    //    int curr_max=arr[0];

    //     for(int i=arr.length-1;i>=0;i--){
    //    //for(int i=0;i<=arr.length-1;i++){
    //    // arr[i]=i+1;    //wrinting
    //    int(curr arr[i]>curr_max);

    //     System.out.println("Display max element array"); 
    //     System.out.println(arr[i]);
    // } 
  // for(int i=arr.length-1;i>=0;i--)
   //for(int i=0;i<arr.length-1;i++)
   //System.out.println(arr[i]);
   // }
//}

//     public static void display(int arr[]){
//      System.out.println("Display an array in orignal form"); 
    
//        for(int i=0;i<=arr.length-1;i++)

// System.out.println(arr[i]);
//     }

//     public static void reverse(int arr[]){
//         System.out.println("Display an array in reverse form"); 
      
//          for(int i=arr.length-1;i>=0;i--)
  
//   System.out.println(arr[i]);
//       }

//}
