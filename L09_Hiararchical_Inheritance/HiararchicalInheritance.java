// Multiple child class inherits properties from a single parent class
class A{
    public void print(){
        System.out.println("Parent class");
    }
}

class B extends A{
    public void print1(){
        System.out.println("Child class 1");
    }
}

class C extends A{
    public void print2(){
        System.out.println("Child class 2");
    }
}

class D extends A{
    public void print3(){
        System.out.println("Child class 3");
    }
}

public class HiararchicalInheritance {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();
        obj1.print();
        obj1.print1();
        obj2.print();
        obj2.print2();
        obj3.print();
        obj3.print3();
    }
}
