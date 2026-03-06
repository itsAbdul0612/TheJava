package RBase;

public class StringClass {
    public static void main(String[] args) {
        String name = "Noor";
        System.out.println(name);

        String a = "NolefnsjnfpisrbffdjnggpgfdfsergoR      ";
        String b = "Noor";
        System.out.println(name.equalsIgnoreCase(a));
        System.out.println(name.equals(a));
//        System.out.println(name.trim().toLowerCase());
        String newName =  name.replace("Noor", "abdul");
        System.out.println(newName);
        System.out.println(a.substring(0, a.length()).trim().toUpperCase());

        Integer v = 10;
        System.out.println(v.toString());

    }
}
