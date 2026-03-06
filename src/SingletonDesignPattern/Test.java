package SingletonDesignPattern;

public class Test {
    public static void main(String[] args) {

        System.out.println(School.getInstance());
        System.out.println(School.getInstance());
        System.out.println(School.getInstance());
    }
}
