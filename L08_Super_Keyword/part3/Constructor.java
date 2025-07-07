// to invoke parent class constructor using super keyword
class A{
    A(){
        System.out.println("Parent class Constructor call");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Child class Constructor call");
    }
}

public class Constructor {
    public static void main(String[] args) {
        B obj1 = new B();
    }
}
