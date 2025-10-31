// multiple inheritance
interface Drawable{
    void draw();
}
interface Shape extends Drawable{
    void area();
}

class Circle implements Drawable,Shape{
    public void draw(){
        System.out.println("Circle draw");
    }
    public void area(){
        System.out.println("Circle area");
    }
}

class Rect implements Drawable,Shape{
    public void draw(){
        System.out.println("Rectangle draw");
    }
    public void area(){
        System.out.println("Rectangle area");
    }
}

class MultipleInherit{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        c1.area();

        Rect r1=new Rect();
        r1.draw();
        r1.area();
    }
}