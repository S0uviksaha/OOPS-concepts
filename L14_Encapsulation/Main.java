// Encapsulation refers to the bundling of data (attributes) and methods 
// it restricts direct access to some of an class's component that is private
package L14_Encapsulation;

class Students{
    private String name;
    private int age;
    private int rollNo;

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public int getAge(){
        return age;
    }

    
    public void setName(String name){
        this.name = name;
    };

    public void setRollNo(int roll){
        this.rollNo = roll;
    }

    public void setAge(int age){
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.setName("Souvik");
        obj.setRollNo(1);
        obj.setAge(22);
        System.out.println(obj.getName());
        System.out.println(obj.getRollNo());
        System.out.println(obj.getAge());
    }
}
