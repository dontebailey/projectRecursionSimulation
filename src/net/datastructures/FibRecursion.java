package net.datastructures;

/**
 * Demonstration of two recursive approaches to computing Fibonacci numbers.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */

public class FibRecursion {


    public static long[] fibonacciGood(int n) {
        if (n <= 1) {
            long[] answer = {n, 0};
            return answer;
        } else {
            long[] temp = fibonacciGood(n - 1);            // returns $\{ F_{n-1},\, F_{n-2} \}$
            long[] answer = {temp[0] + temp[1], temp[0]};  // we want $\{ F_{n},\, F_{n-1} \}$
            return answer;
        }
    }

    public static void main(String[] args) {
        final int limit = 50;

        System.out.println("The good...");
        for (int n = 0; n < limit; n++)
            System.out.println(n + ": " + fibonacciGood(n)[0]);

    }
}
