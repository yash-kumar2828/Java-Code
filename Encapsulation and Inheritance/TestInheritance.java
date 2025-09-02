public class TestInheritance{
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler two=new TwoWheeler();
        vehicle.commute();
        two.commute();

        MotorCycle motor=new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}