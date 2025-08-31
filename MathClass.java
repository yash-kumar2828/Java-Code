public class MathClass{
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(20, 30));
        System.out.println(Math.pow(7,4));
        System.out.println(Math.sqrt(121));
        System.out.println(Math.PI);
        for (int i = 0; i < 10; i++) {
            int rand=(int)Math.round(Math.random()*100);
        System.out.println(rand);
        }
    }
}