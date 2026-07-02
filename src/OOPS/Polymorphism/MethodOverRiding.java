package OOPS.Polymorphism;

public class MethodOverRiding {
    public static void main(String[] args) {

        //Dynamic Method Dispatch or UpCasting
        /*
        It is called "Dynamic Method Dispatch" because the method to be executed is chosen at runtime, It happens when the reference is of parent class, object is of child class and the method is overridden.
        Java then decides the method to be executed at runtime. It shines when different objects behaves differently but shares the same interface
        */
        Payment payment = new PaymentViaUPI();
        payment.pay();

        Payment payment_ = new PaymentViaCard();
        payment_.pay();

  }
}
class Payment{
    public void pay(){
        System.out.println("Payment Mechanism");
    }
}

class PaymentViaUPI extends Payment{

    @Override
    public void pay(){
        System.out.println("Payment Via UPI");
    }
}

class PaymentViaCard extends Payment{

    @Override
    public void pay(){
        System.out.println("Payment Via Card");
    }

}