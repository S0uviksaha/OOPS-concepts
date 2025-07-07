// Abstruction hides the implementaion details and shows only the essential features of the object

abstract class Car{
    abstract public void fuelType();

    public void color(){
        System.out.println("Color is Red");
    }
}

class Tata extends Car{
    public void fuelType(){
        System.out.println("Petrol");
    }
}
public class Abstruction {
    public static void main(String[] args) {
        Tata car1 = new Tata();
        car1.fuelType();
        car1.color();
    }
}
