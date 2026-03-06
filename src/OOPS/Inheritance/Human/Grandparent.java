package OOPS.Inheritance.Human;

public class Grandparent {

    public Grandparent(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Grand Parent's Constructor Called. ");
    }

    private boolean hasSuperpowers = false;
    private String name;
    private int age;

    public boolean isHasSuperpowers() {
        return hasSuperpowers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, int age1) {
        this.age = age;
        this.age = age1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, String name1) {
        this.name = name;
        this.name = name1;
    }
}
