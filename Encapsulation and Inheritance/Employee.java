class Employee{
    private String name;
    private int age;
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    String getEmployeeDetails(){
        return "EmpoloyeeDetails: Name:"+name+", Age:"+age+"";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}