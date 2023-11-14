/*
 * Given a number i from 1 to n (inclusive)
 * if i is multiple of both 3 and 5, print FizzBuzz
 * if i is multiple of 3 and not 5, print Fizz
 * if i is multiple of 5 and not  3 Buzz
 * if i is not multiple of both 3 and 5, print the number
 */

import java.io.*;

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}

public class FizzBuzz {
    public static void main(String[] args) {

        Result.fizzBuzz(15);
    }
}
