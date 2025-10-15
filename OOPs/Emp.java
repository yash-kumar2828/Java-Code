
import java.util.Scanner;

// By metthod variable
class Emp{
    int id;
    String name;
    int age;
    public void setData(int id,String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void getData(){
        System.out.printf("id=%d \nname=%s \nage=%d",id,name,age);
    }
    public static void main(String[] args) {
        Emp e1=new Emp();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter id:");
        e1.id=input.nextInt();
        System.out.println("Enter name:");
        e1.name=input.next();
        System.out.println("Enter age:");
        e1.age=input.nextInt();
        System.out.println("Employee details:");
        e1.setData(e1.id, e1.name, e1.age);
        e1.getData();
    }
}