public class UnaryOperator{
    public static void main(String[] args) {
        int x=5;
        int y=-x;
        int z=-y;
        System.out.println("the value of y="+y);
        System.out.println("the value of z="+z);
        int a=5;
        System.out.println("the value of a="+(a++));
        System.out.println("the value of a="+a);
        System.out.println("the value of a="+(++a));
        System.out.println("the value of a="+(a--));
        System.out.println("the value of a="+a);
        System.out.println("the value of a="+(--a));
    }
}