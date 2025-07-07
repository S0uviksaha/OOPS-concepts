package L3_Constructor;

class Student{
    int id;
    String name;
    int age;

    // default constructor
    Student(){
        System.out.println("Default Constructor");
    }

    // parameterized constructor
    Student(int id){
        this.id = id;
        System.out.println("Parameterized Constructor 1");
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor 2");
    }

    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor 3");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // We can create multiple constructors in a class
        Student s1 = new Student();
        Student s2 = new Student(1);
        Student s3 = new Student(2, "souvik");
        Student s4 = new Student(3, "souvik", 22);
    }
}
