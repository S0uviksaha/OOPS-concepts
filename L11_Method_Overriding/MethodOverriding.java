// Method Overriding
package L11_Method_Overriding;

class Bank{
    public void RateOfInterest(){
        System.out.println("General rate of interest is 6%");
    }
}

class SBI extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest in SBI is 7%");
    }
}

class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of Interest in PNB is 8%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank obj1 = new Bank();
        SBI obj2 = new SBI();
        PNB obj3 = new PNB();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
        obj3.RateOfInterest();
    }
}
