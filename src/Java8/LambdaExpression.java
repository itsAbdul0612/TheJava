package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LambdaExpression {

 /*
 ********* Lambda Expression *********

 To create a Lambda Expression:
 * 1. Remove Access Modifier.
 * 2. Remove Return Type.
 * 3. Remove Method Name.
 * 4. Add an arrow ->.
 * 5. iF single parameter, remove parenthesis.

 */
    public static void main(String[] args) {

        // Example: 1
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Imperative Code
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] % 2 == 0) sum += arr[i];
        }
        System.out.println(sum);

        // Imperative Code using Stream API
        IntStream intStream = Arrays.stream(arr).filter(i -> i % 2 == 0);
        System.out.println(intStream.sum());

        // Example: 2
        Walk walk = steps -> steps * 2; // returning steps * 2

        System.out.println("Walked: "+walk.walk(5)+ " steps");

    }

    @FunctionalInterface
    private interface Walk{
        int walk(int steps);
    }

    /*
    * Benefits of Lambda Expression:
    * 1. Enables functional programming.
    * 2. Promotes code readability.
    * 3. Simplifies code.
    * 4. Reduces Jar file size.
    * 5.
    * */

}
