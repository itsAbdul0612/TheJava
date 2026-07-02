package OOPS.Inheritance.Human;

public class Test {
    public static void main(String[] args) {

        Child child = new Child("Abu Taha", 18);
        child.childMethod();
        System.out.println(child.getAge()+", "+child.getName());

    }
}
