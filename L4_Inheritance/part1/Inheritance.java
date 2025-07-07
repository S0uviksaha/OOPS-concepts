package L4_Inheritance.part1;

class ParentClass{
    void display(){
        System.out.println("Parent class method");
    }
}

class Childclass extends ParentClass{
    void show(){
        System.out.println("Child class method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Childclass child1 = new Childclass();
        child1.display(); // Inherited method from ParentClass
        System.out.println();
        child1.show(); // Method from Childclass
    }
}
