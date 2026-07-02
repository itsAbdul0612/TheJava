package Static;

public class Student {
    public static int count = 0;

    public Student(){
        count++;
    }
    public static void getCount(){
        System.out.println(count);
    }

    private int roll;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
