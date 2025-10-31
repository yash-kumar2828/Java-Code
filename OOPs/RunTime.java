// runtime polymorphism 
abstract class Shape{
    abstract public void area();
}

class Circle extends Shape{
    int r;
    public Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of Circle:"+(3.14*r*r));
    }
}

class Rect extends Shape{
    int l,b;
    public Rect(int l, int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("Area of Rectangle :"+(l*b));
    }
}

class RunTime{
    public static void main(String[] args) {
        Shape s=new Circle(7);
        s.area();
        s=new Rect(7,11);
        s.area();
    }
}