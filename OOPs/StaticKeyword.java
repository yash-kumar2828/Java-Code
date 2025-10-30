// static keyword

class StaticKeyword{
    static String collegeName="SRC";
    int roll;
    String name;
    int age;
    public StaticKeyword(int roll,String name, int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("College name="+collegeName+"\nRoll no="+roll+"\nName="+name+"\nAge="+age);
    }
    public static void main(String[] args) {
        StaticKeyword s1=new  StaticKeyword(227,"Yash",20);
        s1.display();
    }
}