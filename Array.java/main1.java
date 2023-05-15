class person
{
    String name; int age; // instance variable
    person(String name,int age) // constructor
    {
        this.name=name;
        this.age=age;
    }
}
class student extends person{
    int rollno; int marks;
    student(String name,int age,int rollno,int marks)
    {
        super(name,age);
        this.rollno=rollno;
        this.marks=marks;
        System.out.println(name+" "+age);
        System.out.println(rollno+" "+marks);
    }
}
public class main1
{
    public static void main(String[] args) {
        student s=new student("Durga",28,2023,70);

    }
}