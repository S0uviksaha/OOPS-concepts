package L2.part2;

class Dogs{
    // Data members or Attributes
    String name;
    int age;

    // Member functions or behaviour or Methods
    public void eat(){
        System.out.println(name+" eats");
    }
}

public class Dog {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
        dog1.name = "Tommy";
        dog1.age = 5;
        dog1.eat();
    }
    
}
