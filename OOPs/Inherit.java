// method overriding with inheritance
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog Eating");
    }
}

class Lion extends Animal{
    public void eat(){
        System.out.println("Lion Eating");
    }
}
class Elephent extends Animal{}
class Inherit{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        Lion l1=new Lion();
        l1.eat();
        Elephent e1=new Elephent();
        e1.eat();
    }
}