package Multithreading;

public class Test {
    public static void main(String[] args) {
long starttime = System.currentTimeMillis();
        for (int i  = 1; 1 < 10; i++){

            System.out.println(factorial(i));
            System.out.println("Total Time: "+(System.currentTimeMillis() - starttime));
        }
}
    public static long factorial(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            result *= i;
        }
        return result;

    }
}