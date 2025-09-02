
public class StudentToString {

    String name;
    int age;
    int rollNumber;
    String house;

    public StudentToString(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "student details:{name:" + name + ",age:" + age + ",roll number:" + rollNumber + ",house:" + house + "}";
    }

    public static void main(String[] args) {
        StudentToString std = new StudentToString("yash", 20, 101, "Vaishali");
        System.out.println(std);
    }
}
