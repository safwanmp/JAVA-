abstract class Vehicle {
    abstract void start();

    void display() {
        System.out.println("Vehicle is ready");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.display();
        car.start();
        bike.display();
        bike.start();
    }
}
