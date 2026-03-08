package OOPS.String_Mutability;

public class Test {
    public static void main(String[] args) {

        Cat c = new Cat();

        c.name = "Binna";


        System.out.println(c.name);
        Cat cat = makeCatsNameUppercase(c);
        System.out.println(cat.name);
        System.out.println(c.name);

    }
    public static Cat makeCatsNameUppercase(Cat cat){
        cat.name = cat.name.toUpperCase();
        return cat;
    }

}
