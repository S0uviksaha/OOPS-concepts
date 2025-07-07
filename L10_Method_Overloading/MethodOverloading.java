// Method Overloading
public class MethodOverloading {

    public static int sum(int a, int b){
        return a+b;
    }
    // same function name with different arguments
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    // same function name with different data type
    public static String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(4,5,9));
        System.out.println(sum("Ram123","@gmail.com"));
    }
}
