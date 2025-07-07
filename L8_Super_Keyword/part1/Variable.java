// to invoke parent class variable using super keyword
package L8_Super_Keyword.part1;

class A{
    String color = "Black";
}

class B extends A{
    String color = "Blue";

    public void show(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Variable {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
    }
}
