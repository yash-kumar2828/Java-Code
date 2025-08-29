public class Car{
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    Car( String color){
        noOfWheels=4;
        this.color=color;
        maxSpeed=150;
        currentFuelInLiters=4;
        noOfSeats=5;

    }
    public Car start(){
        if(currentFuelInLiters==0){
            System.out.println("car is out of fuel, can not start");
        }else if(currentFuelInLiters<5){
            System.out.println("car is in reserved mode, please refuel");
            currentFuelInLiters--;
        }else{
        System.out.println("car is started");
        currentFuelInLiters--;
        }
        return this;
    }
    public void drive(){
        currentFuelInLiters--;
        System.out.println("car is driving");
    }
    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    public static void main(String[] args) {
        Car myCar=new Car("red");
        myCar.start().drive();
        System.out.println("fuel:"+myCar.getCurrentFuelLevel());
        System.out.println("color:"+myCar.color);
        System.out.println("no of seats:"+myCar.noOfSeats);
        System.out.println("no of wheels"+myCar.noOfWheels);
        System.out.println("max speed"+myCar.maxSpeed);
    }
}