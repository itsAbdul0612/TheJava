package OOPS;

public class Test {

    public static void main(String[] args) {














//        Cars car = new Cars();
//        car.brand = "Tata";
//        car.colour = "Black";
//        car.model = "Safari";
//        car.speed = 40;
//        car.year = 2025;
//
//        car.accelerate(10);
//        car.breakk();
        System.out.println(isPrime(10));

        Cat c = new Cat();

        c.name = "Binna";


        System.out.println(c.name);
        Cat cat = makeCatsNameUppercase(c);
        System.out.println(cat.name);

    }
    public static Cat makeCatsNameUppercase(Cat cat){
        cat.name = cat.name.toUpperCase();
        return cat;
    }

    public static boolean isPrime(int x){
        int res = 0;
        for (int i = 1; i > x/2; i++){
            if (x % i == 0){
                res++;
            }
        }
        return res == 2;
    }
}
