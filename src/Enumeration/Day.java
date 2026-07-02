package Enumeration;

public enum Day {
    SUNDAY("Sunday", "Somwar"),
    MONDAY("Monday", "Mangalwar"),
    TUESDAY("Tuesday", "Budwar"),
    WEDNESDAY("Wednesday", "Guruwar"),
    THURSDAY("Thursday", "Shukrwar"),
    FRIDAY("Friday", "Shaniwar"),
    SATURDAY("Saturday", "Raviwar");

  private String English;
  private String hindi;

    Day(String English, String Hindi){
        this.English = English;
        this.hindi = Hindi;
    }

    public String getEnglish() {
        return English;
    }

    public String getHindi() {
        return hindi;
    }

    public void display(){
        System.out.println("Today is " + this.name());
    }
}
