package OOPS.Polymorphism;

public class MethodOverRiding {
    public static void main(String[] args) {
        iPhone13 phone = new iPhone13();

        phone.setPhoneNumber(853066981);
        phone.setPrimaryLens("Primary Lens");

        phone.call();
        phone.camera();
        phone.sms();
    }
}
class MobilePhone{
    public void call(){
        System.out.println("Calling...");
    }

    public void sms(){
        System.out.println("Texting...");
    }

    public void camera(){
        System.out.println("Clicking Picture...");
    }
}

class iPhone13 extends MobilePhone{

   private int phoneNumber;
   private String primaryLens;

    public void call(){
        System.out.println("Calling... "+phoneNumber);
    }

    public void sms(){
        System.out.println("Texting... "+phoneNumber);
    }

    public void camera(){
        System.out.println("Clicking Picture with "+ primaryLens);
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPrimaryLens(String primaryLens) {
        this.primaryLens = primaryLens;
    }
}