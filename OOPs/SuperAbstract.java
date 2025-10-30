// super and abstract keyword 
abstract class Emp{
    String fname,lname;
    abstract public void fullname();
    public Emp(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }
}

class ParmanentEmp extends Emp{
    float salary;
    public ParmanentEmp(String fname,String lname, float salary){
        super(fname,lname);
        this.salary=salary;
    }
    public void fullname(){
        System.out.println("First name:"+fname+"\nLast name:"+lname);
    }
    public void salary(){
        System.out.println("Salary:"+salary);
    }
}

class TempEmp extends Emp{
    float salary;
    public TempEmp(String fname,String lname, float salary){
        super(fname,lname);
        this.salary=salary;
    }
    public void fullname(){
        System.out.println("\nFirst name:"+fname+"\nLast name:"+lname);
    }
    public void salary(){
        System.out.println("Salary:"+salary+" per hour");
    }
}


class SuperAbstract{
    public static void main(String[] args) {
        ParmanentEmp p1=new ParmanentEmp("Yash","Kumar",40000f);
        p1.fullname();
        p1.salary();

        TempEmp t1=new TempEmp("Yash","Kumar",300f);
        t1.fullname();
        t1.salary();
    }
}