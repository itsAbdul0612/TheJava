package OOPS.Polymorphism;

public class MethodOverLoading {
    public static void main(String[] args) {

        System.out.println(sum(10, 10));
        System.out.println(sum(10, 10, 10));
        System.out.println(sum(10.0, 10.0, 10.0));

    }

    public static int sum(int a, int b){
        return a+b;
    }
    private static int sum(int a, int b, int c){
        return a+b+c;
    }
    private static double sum(double a, double b, double c){
        return a+b+c;
    }
}
