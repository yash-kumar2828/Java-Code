
public class StringManipulation {

    public static void main(String[] args) {
        String firstName = "Yash";
        String lastName = "Kumar";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("full name is " + fullName);
        System.out.println("full name:" + fullName.toUpperCase());
    }
}
