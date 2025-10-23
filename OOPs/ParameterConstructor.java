
class ParameterConstructor{
    int age;
    String name;
    public ParameterConstructor(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void getData(){
        System.out.println("age="+age+"\nname="+name);
    }
    public static void main(String[] args) {
        ParameterConstructor p=new ParameterConstructor(20,"Yash");
        p.getData();
    }
}