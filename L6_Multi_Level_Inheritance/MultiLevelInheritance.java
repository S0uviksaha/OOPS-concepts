package L6_Multi_Level_Inheritance;

class A{
    void methodA(){
        System.out.println("Method of Class A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method of Class B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("Method of Class C");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.methodC();
        obj1.methodB();
        obj1.methodA();
    }
}
