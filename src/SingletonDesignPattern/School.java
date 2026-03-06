package SingletonDesignPattern;

public class School {
    private static School instance;

    private School(){}

    public static School getInstance(){
        return instance;
    }
}
