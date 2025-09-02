public class EqualCodeTest{
    public static void main(String[] args) {
        Person person1=new Person("yash",20,"001");
        Person person2=new Person("yash",20,"001");
        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("not equals");
        }
    }
}