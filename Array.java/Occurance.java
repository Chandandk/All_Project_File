import java.util.*;

public class Occurance {
   public static void main(String[]args){
    System.out.print("Enter the size of an array :"+" ");
    Scanner scr= new Scanner(System.in);
    int size=scr.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter the array element :"+" ");
    for(int i=0;i<arr.length;i++){
    arr[i]=scr.nextInt(); // element of an array
    int tar=scr.nextInt(); // target element take from user
}     
   }
    public static int FirstOccurence(int arr[],int tar){
        int ans=-1;
        int st=0; int end=arr.length-1;
       
        while(st<=end){
        int mid=(st+(end-st)/2);

            if(arr[mid]==tar){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<tar){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
       System.out.println(st);
       
        }
        return ans;
    }
}