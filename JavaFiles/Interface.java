package JavaFiles;
import java.util.Scanner;

public interface client {
   void input();

    void output();
}

class Raju implements client{
 String name;
 double sal;

 public void input(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the user name:"+" ");
    name=sc.nextLine();
    System.out.println("Enter the Salary:"+" ");
    sal=sc.nextDouble();
}
public void output(){
    System.out.println(name+" "+sal);
}
public static void main(String[] args) {
    client c=new Raju();
    c.input();
    c.output();

}
}
