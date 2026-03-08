package OOPS.Class_The_Blueprint;

public class CarsClass {

    // Classes are blueprints for creating objects, which are instances of that class. A class defines the Fields and behavior that objects of that class will possess. Think of a class like a template.


    // Fields (Attributes)
    String brand;
    String colour;
    String model;
    int year;
    int speed;


    // Behaviours (Methods)
    public void accelerate(int increment){
        speed += increment;
        System.out.println("Speed: " + speed);
    }
    public void breakk(){
        speed = 0;
        System.out.println("Speed: " + speed);
    }
}
