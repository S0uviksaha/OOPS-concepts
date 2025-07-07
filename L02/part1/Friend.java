class Friends {
    final String name = "Sourav";
    int rollNo;
    String address;

    public void printData(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Address: "+address);
        System.out.println();
    }
}

public class Friend {
    public static void main(String[] args) {

        Friends frnd1 = new Friends();
        // frnd1.name = "Sourav";   // Error: cannot assign a value to final variable 'name'
        frnd1.rollNo = 5;
        frnd1.address = "Kolkata";
        frnd1.printData();
        // modify data of frnd1
        frnd1.rollNo = 4;
        frnd1.printData(); // roll number updated and printed
    }
}
