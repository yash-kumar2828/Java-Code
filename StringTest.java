public class StringTest{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("First ");
        sb.append(47);
        sb.append(", now this is the");
        sb.append(74.47);
        System.out.println(sb);
    }
}