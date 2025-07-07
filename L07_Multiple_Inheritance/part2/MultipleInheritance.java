// Multiple inheritance using Interface

interface A{
    public void method();
}

interface B{
    public void method();
}

class C implements A,B{
    public void method(){
        System.out.println("Multiple inheritance implemented using Interface");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.method();
    }
}
