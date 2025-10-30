// this keyword

class Student{
    int roll;
    String name,course;
    float fee;
    public Student(int roll,String name, String course){
        this.roll=roll;
        this.name=name;
        this.course=course;
    }
    public Student(int roll, String name, String course, float fee){
        this(roll, name, course);
        this.fee=fee;
    }
    public void display(){
        System.out.println("Roll no="+roll+"\nName="+name+"\nCourse="+course+"\nFee="+fee);
    }
}

class Test{
    public static void main(String[] args) {
        Student s1=new Student(227,"Yash","BCA");
        s1.display();
        Student s2=new Student(227,"Yash","Java",6000f);
        s2.display();
    }
}