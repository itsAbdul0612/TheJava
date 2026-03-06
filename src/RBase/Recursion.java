package RBase;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(sumOfNNaturalNumbers(5));
    }
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumOfNNaturalNumbers(int n){
        if (n == 1){
            return 1;
        }
        return n + sumOfNNaturalNumbers(n - 1);

    }

}
