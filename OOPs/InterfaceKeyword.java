// Interface keyword
interface Shape{
    void area();
}

class Circle implements Shape{
    int r;
    public Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of Circle:"+(3.14*r*r));
    }
}

class Rect implements Shape{
    int l,b;
    public Rect(int l, int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("Area of Rectangle:"+(l*b));
    }
}

class InterfaceKeyword{
    public static void main(String[] args) {
        Circle c1=new Circle(7);
        c1.area();

        Rect r1=new Rect(7,11);
        r1.area();
    }
}