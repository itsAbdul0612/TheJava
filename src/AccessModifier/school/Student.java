package AccessModifier.school;

public class Student {
    public String name;
    public int age;

//    private Student(){}

    public void sayHello(){
        System.out.println("Hello world!");
    }

    public static void sayBye(){
        System.out.println("bye...");
    }
}
