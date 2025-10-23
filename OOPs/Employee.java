//copy constructor
class Employee{
    int roll;
    String name;
    int age;
    public Employee(int age,String name, int roll){
        this.age=age;
        this.name=name;
        this.roll=roll;
    }
    public Employee(Employee e){
        age=e.age;
        name=e.name;
        roll=e.roll;
    }
    public void display(){
        System.out.println("age="+age+"\nname="+name+"\nroll no.="+roll);
    }
    
    
    public static void main(String[] args) {
        Employee e1=new Employee(20,"Yash",227);
        Employee e2=new Employee(e1);
        e1.display();
        e2.display();
    }
}
    