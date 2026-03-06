package RBase;

public class LamdaExpression {

    public static void main(String[] args) {
        Thread t = new Thread(
                () -> System.out.println(Thread.currentThread().getName()+ " says Hello Thread!")
        );
         t.start();
    }
}

