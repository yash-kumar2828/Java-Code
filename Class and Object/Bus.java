public class Bus{
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;
    public Bus(int noOfWheels,int noOfDoors,int maxSpeed,String name,String modelNumber,String company){
        this.noOfWheels=noOfWheels;
        this.noOfDoors=noOfDoors;
        this.maxSpeed=maxSpeed;
        this.name=name;
        this.modelNumber=modelNumber;
        this.company=company;
    }
    @Override
    public String toString(){
        return "My Bus name is:"+name;
    }
    public static void main(String[] args){
        Bus b1=new Bus(4,4,120,"bus","Sw234","Mart");
        System.out.println(b1.toString());
        System.out.println(b1.noOfWheels);
        System.out.println(b1.noOfDoors);
        System.out.println(b1.maxSpeed);
        System.out.println(b1.name);
        System.out.println(b1.modelNumber);
        System.out.println(b1.company);
    }
}