public class TestEmployee{
    public static void main(String[] args) {
        Employee emp=new Employee("Yash",20);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Kumar");
        System.out.println(emp.getEmployeeDetails());
    }
}