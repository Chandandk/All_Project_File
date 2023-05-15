class Student {
  public String name;
  public int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Person extends Student {
  int roll_no;
  int marks;

  Person(String name, int age, int roll_no, int marks) {
    super(name, age);
    this.roll_no = roll_no;
    this.marks = marks;

  }
  @Override
  public String toString(){
      return name;
}

public class Main {
  public static void main(String[] args) {
    Student[] myStudents = new Student[2];
    a[0]=new Student("Dharma");
    a[1]=new Student("Rahul");
    for(int i=0;i<myStudent.length;i++){
      System.out.println(myStudent[i].name);
    }
    {new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")};
    for (Student m : mystudent) {
      System.out.println(m);
    }

  }
}
}