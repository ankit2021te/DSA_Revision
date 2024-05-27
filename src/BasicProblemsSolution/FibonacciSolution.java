package BasicProblemsSolution;

/**
 * 1. Fibonacci Series
 * Write a program to generate the first n Fibonacci numbers.
 */

public class FibonacciSolution {
    public static void main(String[] args) {
        int input = 12;
        // First Approach
//        for(int i=0;i<=input;i++){
//            System.out.println("Fibonacci Series for "+i +" is "+fibonacciSeries(i));
//        }
        // Second Approach
        //generateFibonacciSeries(input);
        System.out.println("************************");
        for (int i = 0; i < input; i++) {
            // Third Approach
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacciSeries(int input) {
        int result = 0;
        int a = 0;
        int b = 1;
        if (input == 1)
            return b;
        if (input == 0)
            return a;
        for (int i = 2; i <= input; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    private static void generateFibonacciSeries(int input) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < input; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    private static int fibonacci(int input) {
        if (input == 0)
            return 0;
        if (input == 1)
            return 1;
        return fibonacci(input - 2) + fibonacci(input - 1);
    }
}
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

/**
 * Sure, here's an example of generating the Fibonacci series up to a given number `n` in Java.
 * This version allows for both iterative and recursive approaches.
 * <p>
 * ### Iterative Approach
 * <p>
 * In the iterative approach, we use a loop to generate the series:
 * <p>
 * ```java
 * public class FibonacciSeriesIterative {
 * public static void main(String[] args) {
 * int n = 10; // The number of terms to generate
 * generateFibonacciSeries(n);
 * }
 * <p>
 * public static void generateFibonacciSeries(int n) {
 * int a = 0, b = 1, c;
 * System.out.print(a + " " + b);
 * <p>
 * for (int i = 2; i < n; i++) {
 * c = a + b;
 * System.out.print(" " + c);
 * a = b;
 * b = c;
 * }
 * System.out.println();
 * }
 * }
 * ```
 * <p>
 * ### Recursive Approach
 * <p>
 * In the recursive approach, we use a recursive function to compute each term:
 * <p>
 * ```java
 * public class FibonacciSeriesRecursive {
 * public static void main(String[] args) {
 * int n = 10; // The number of terms to generate
 * for (int i = 0; i < n; i++) {
 * System.out.print(fibonacci(i) + " ");
 * }
 * System.out.println();
 * }
 * <p>
 * public static int fibonacci(int n) {
 * if (n == 0) {
 * return 0;
 * } else if (n == 1) {
 * return 1;
 * } else {
 * return fibonacci(n - 1) + fibonacci(n - 2);
 * }
 * }
 * }
 * ```
 * <p>
 * ### Explanation
 * <p>
 * 1. **Iterative Approach:**
 * - Initialize the first two terms of the series (`a = 0` and `b = 1`).
 * - Use a loop to generate the next terms by adding the previous two terms (`c = a + b`).
 * - Update the variables `a` and `b` to the latest two terms.
 * <p>
 * 2. **Recursive Approach:**
 * - Define a recursive method `fibonacci` that computes the Fibonacci number at position `n`.
 * - Base cases: If `n` is 0, return 0; if `n` is 1, return 1.
 * - For other values of `n`, recursively calculate the sum of the two preceding numbers.
 * <p>
 * Both approaches generate the Fibonacci series up to `n` terms,
 * but the iterative approach is more efficient in terms of time and space complexity compared
 * to the recursive approach. The recursive approach, while elegant, can be slow and memory-intensive
 * for large `n` due to repeated calculations and function call overheads.
 */