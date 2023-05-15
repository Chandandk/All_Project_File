public class Recursion {
    public static void main(String[]args){
        int n;
        PrintDec(n=5);
    }
    public static void PrintDec(int n){
        if(n==0)  //{
          //  System.out.println("Hitting Base Case");
            return;
       // }
       // System.out.println("Calling function with the value n->"+n);
       PrintDec(n-1);
       System.out.println(n);
       // System.out.println("Having faith that the functionwill print the rest value staring from->"+(n-1));

        //PrintDec(n-1);
    }

    }

