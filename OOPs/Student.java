
import java.util.Scanner;

//By instance variable 

class Student{
    int age;
    String name;
    public static void main(String[] args) {
        Student s1=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter age:");
        s1.age=input.nextInt();
        System.out.println("Enter name:");
        s1.name=input.next();
        System.out.println("Student detail:");
        System.out.println("Age="+s1.age+"\nname="+s1.name);
    }
}