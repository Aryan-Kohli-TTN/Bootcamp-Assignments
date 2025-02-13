package Assignment;

sealed class Vehicle permits Car,Bike,Scooty{
    public void getPower(){
        System.out.println("Vehicle power");
    }
}
sealed class Bike extends Vehicle permits Yamaha,Pulsar{
    @Override
    public void getPower(){
        System.out.println("Bike Power");
    }
}
non-sealed class Yamaha extends Bike{
    @Override
    public void getPower(){
        System.out.println("Yahmana Power is 1222cc ");
    }
}
non-sealed class Pulsar extends Bike{
    @Override
    public void getPower(){
        System.out.println("Pulsar Power is 1222cc ");
    }
}
non-sealed class Car extends Vehicle{
    @Override
    public void getPower(){
        System.out.println("Car Power");
    }
}
final class Scooty extends Vehicle{
    @Override
    public void getPower(){
        System.out.println("Scooty Power");
    }
}
public class Question4_5 {
    public static void main(String[] args) {
        Vehicle v1 =new Bike();
        Vehicle v2 =new Car();
        Vehicle v3 =new Scooty();
        Vehicle v4 =new Pulsar();

        v1.getPower();
        v2.getPower();
        v3.getPower();
        v4.getPower();
    }
}
