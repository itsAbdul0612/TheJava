public class GrandTest {

    public static void main(String[] args) {;

        Thread thread = new Thread(()->
            System.out.println(Thread.currentThread().getName()+ " Hello")
        , "Hello Thread");
thread.start();
    }

}
