//default constructor
class DefaultConstructor{
    int age;
    String name;
    public DefaultConstructor(){
        age=0;
        name="unknown";
    }
    public void getdata(){
        System.out.println("age="+age+"\nname="+name);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.getdata();
    }
}