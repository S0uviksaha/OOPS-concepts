// Access Modifiers in java
// 1. public - accessible from anywhere (any packackage)
// 2. protected - accesssible within the same package and subclasses (even in different packages)
// 3. private - accesssible only within the same class
// 4. default - accessible only within the same package (no modifier)


class A{
    int a = 10; // default
    public int b = 20; // public
    protected int c = 30; // protected
    private int d = 40; // private

    // default method
    void displayA(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }

    // public method
    public void displayB(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }

    // protected method
    protected void displayC(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }

    // private method    
    private void displayD(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    } // this method can't be accessed outside this class
    
}

class B extends A{
    int e = a + b + c ; // d cant be accessed here as it is private to A
    private int f;
    
    public void displayE(int f){
        this.f = f;
        displayC(); // protected method can be accessed here as B is a subclass od A
        System.out.println("e = "+e);
        System.out.println("f = "+f);
    }

}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.a = 100;
        obj.b = 200;
        obj.c = 300;
        // obj.d = 400;  // error :: d is private to A, so it can't be accessed here
        obj.displayA();
        obj.displayB();
        obj.displayC();
        // obj.displayD();   // error :: private method can't be accessed here

        B obj2 = new B();
        obj2.displayE(1000);
        
    }
}
