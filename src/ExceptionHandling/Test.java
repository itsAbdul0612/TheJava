package ExceptionHandling;

public class Test {
    public static void main(String[] args) {

        int Num[] = {20, 40, 30, 80};
        int Den[] = {2, 0, 30, 70};

        for (int i = 0; i < Num.length; i++){
            System.out.println(divide(Num[i], Den[i]));
        }
        System.out.println("Done");
    }
    public static int divide(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return -1;
    }
}
