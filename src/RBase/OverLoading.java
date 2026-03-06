package RBase;

public class OverLoading {


    public static void main(String[] args) {
        method();
        method(1);
        method("Hi");
        method(1,2);
    }



    public static void method(){
        System.out.println("Method 1");
    }
    public static void method(int a){
        System.out.println("Method 2");
    }
    public static void method(String a){
        System.out.println("Method 3");
    }
    public static void method(int a, int b){
        System.out.println("Method 4");
    }
}
