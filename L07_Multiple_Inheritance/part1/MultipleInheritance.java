// Multiple inheritance is directly not possible in java as it creates ambiguity (When same function present in both parent class)

// Concept of Interface
interface Car{
    public void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric Car starts");
    }
}

class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel Car starts");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Car electriCar = new ElectricCar();
        Car dieselCar = new DieselCar();
        electriCar.start();
        dieselCar.start();
    }
}
