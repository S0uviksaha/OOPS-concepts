package L4_Inheritance.part2;

class Vehicle {
    float price;
    float milage;
    String color;

    void display() {
        System.out.println("Price: " + price);
        System.out.println("Milage: " + milage);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle{
    String fuelType;
    Boolean sunRoof;
    String brand;

    void show(){
        System.out.println("Fuel Type: " + fuelType);
        if(sunRoof == true){
            System.out.println("Sun Roof : Yes");
        }
        else{
            System.out.println("Sun Roof : No");
        }
        System.out.println("Brand: " + brand);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.price = 2000000;
        car1.milage = 18.5f;
        car1.color = "Red";
        car1.fuelType = "Petrol";
        car1.sunRoof = true;
        car1.brand = "BMW";

        System.out.println("Car Details:");
        car1.display(); // Inherited method from Vehicle Class
        System.out.println();
        car1.show(); // Method from Car class
    }
}
