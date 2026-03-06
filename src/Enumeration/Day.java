package Enumeration;

public enum Day {
    SUNDAY("Sunday", "Somwar"),
    MONDAY("Monday", "Mangalwar"),
    TUESDAY("Tuesday", "Budwar"),
    WEDNESDAY("Wednesday", "Guruwar"),
    THURSDAY("Thursday", "Shukrwar"),
    FRIDAY("Friday", "Shaniwar"),
    SATURDAY("Saturday", "Raviwar");

  private String lower;
  private String hindi;

    Day(String lower, String hindi){
        this.lower = lower;
        this.hindi = hindi;
    }

    public String getLower() {
        return lower;
    }

    public String getHindi() {
        return hindi;
    }

    public void display(){
        System.out.println("Today is " + this.name());
    }
}
