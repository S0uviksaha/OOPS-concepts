public class Student {
    String name;
    int rollNo;

    public void printData(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name = "Souvik";
        std1.rollNo = 5;
        std1.printData();

        Student std2 = new Student();
        std2.name = "Soumadip";
        std2.rollNo = 3;
        std2.printData();
        
    }
}
