package Enumeration;

public class Test {
    public static void main(String[] args) {
        Day day = Day.TUESDAY;

        switch (day){
//            case MONDAY:
//                System.out.println("Today is Monday");
//                break;
//            case TUESDAY:
//                System.out.println("Today is Tuesday");
//                break;
//            case WEDNESDAY:
//                System.out.println("Today is Wednesday");
//                break;


            // Switch syntax from java 12
            case MONDAY -> {
                System.out.println("Today is Monday");

            }
            case TUESDAY -> {
                System.out.println("Today is Tuesday");
            }
        }

//        System.out.println(mon.getHindi());
//        System.out.println(mon.getLower());
//        mon.display();

    }
}
