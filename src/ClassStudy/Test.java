package ClassStudy;

public class Test {
    public static void main(String[] args) {
       ShoppingCart shoppingCart = new ShoppingCart(150);

       CreditCard creditCard = new CreditCard();
       shoppingCart.paymentProcess(creditCard );
    }
}
