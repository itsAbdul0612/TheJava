package OOPS;

public class Cars {
    String brand;
    String colour;
    String model;
    int year;
    int speed;

    public void accelerate(int increment){
        speed += increment;
        System.out.println("Speed: " + speed);
    }
    public void breakk(){
        speed = 0;
        System.out.println("Speed: " + speed);
    }
}
