// to invoke parent class method using super keyword
package L8_Super_Keyword.part2;

class Animal{
    public void work(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    public void work(){
        System.out.println("Dog eats");
        System.out.println("Dog barks");
    }
    public void show(){
        super.work();
        work();
    }
}

public class Method {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.show();
    }
}
