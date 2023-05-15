import java.util.*;
class transpose{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row size:"+" " );
        int row=sc.nextInt();
        System.out.print("Enter Col size:"+" " );
        int col=sc.nextInt();

        int num[][]=new int[row][col];

        //Input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
               int temp =num[i][j];
               
            }
        }
        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(num[i][j]+" ");
             }
             System.out.println();
        }
    }
}
