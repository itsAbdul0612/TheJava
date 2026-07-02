package Java8;

import java.util.List;

public class Streams {
    /*
    * You can convert a collection to a stream to perform declarative operations on the collection.
    *
    * 1. Stream API is a powerful tool for processing collections in Java.
    * 2. It promotes readability and maintainability.
    * 3. It allows declarative and functional programming.
    */
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cucumber", "Kiwi", "Mango");

        list.stream().filter(fruit -> fruit.length() <= 6)
                .map(s -> s.length())
                .sorted()
                .map(s -> s*2)
                .forEach(fruits ->System.out.println(fruits));
    }

    // There are many more methods available in Stream API that we can check out if needed.
}