package Test1;

public class Student {
    String name;
   private int age;
    int rollNumber;

    public void setAge(int age){
        if (age < 0){
            age = 0;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
