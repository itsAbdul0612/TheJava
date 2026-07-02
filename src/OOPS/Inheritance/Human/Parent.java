package OOPS.Inheritance.Human;

public class Parent extends Grandparent{
    public Parent(String name, int age){
        super(name, age);
        System.out.println("Parents Constructor Called.");
    }

    public void parentMethod(){
        System.out.println("Parent Method Called.");
    }

    public void money(){
        System.out.println("No Wealth");
    }
}
