package BasicProblems;

/**
 * Java interview programs are a common part of technical interviews for software development roles. These programs test a candidate's problem-solving skills, understanding of algorithms, and proficiency in Java programming. Below, I’ve compiled a list of typical Java interview programs along with brief explanations and sample solutions. This list covers a range of problems from basic to more advanced topics.
 *
 * ### 1. **Fibonacci Series**
 * The Fibonacci series is a sequence where each number is the sum of the two preceding ones, usually starting with 0 and 1.
 *
 * **Program:**
 * ```java
 * public class Fibonacci {
 *     public static void main(String[] args) {
 *         int n = 10; // Number of terms to print
 *         int a = 0, b = 1;
 *         System.out.print(a + " " + b);
 *
 *         for (int i = 2; i < n; i++) {
 *             int next = a + b;
 *             System.out.print(" " + next);
 *             a = b;
 *             b = next;
 *         }
 *     }
 * }
 * ```
 *
 * ### 2. **Check for Prime Number**
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 *
 * **Program:**
 * ```java
 * public class PrimeCheck {
 *     public static void main(String[] args) {
 *         int num = 29;
 *         boolean isPrime = true;
 *
 *         for (int i = 2; i <= Math.sqrt(num); i++) {
 *             if (num % i == 0) {
 *                 isPrime = false;
 *                 break;
 *             }
 *         }
 *
 *         if (isPrime)
 *             System.out.println(num + " is a prime number.");
 *         else
 *             System.out.println(num + " is not a prime number.");
 *     }
 * }
 * ```
 *
 * ### 3. **Reverse a String**
 * Reversing a string involves changing the order of characters in the string such that the last character becomes the first, and so on.
 *
 * **Program:**
 * ```java
 * public class ReverseString {
 *     public static void main(String[] args) {
 *         String str = "Hello World";
 *         String reversed = new StringBuilder(str).reverse().toString();
 *         System.out.println("Reversed String: " + reversed);
 *     }
 * }
 * ```
 *
 * ### 4. **Palindrome Check**
 * A palindrome is a string that reads the same forward and backward.
 *
 * **Program:**
 * ```java
 * public class PalindromeCheck {
 *     public static void main(String[] args) {
 *         String str = "radar";
 *         String reversed = new StringBuilder(str).reverse().toString();
 *
 *         if (str.equals(reversed))
 *             System.out.println(str + " is a palindrome.");
 *         else
 *             System.out.println(str + " is not a palindrome.");
 *     }
 * }
 * ```
 *
 * ### 5. **Factorial Calculation**
 * The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
 *
 * **Program:**
 * ```java
 * public class Factorial {
 *     public static void main(String[] args) {
 *         int num = 5;
 *         long factorial = 1;
 *
 *         for (int i = 1; i <= num; i++) {
 *             factorial *= i;
 *         }
 *
 *         System.out.println("Factorial of " + num + " is " + factorial);
 *     }
 * }
 * ```
 *
 * ### 6. **Binary Search**
 * Binary search is an efficient algorithm for finding an item from a sorted list of items.
 *
 * **Program:**
 * ```java
 * import java.util.Arrays;
 *
 * public class BinarySearch {
 *     public static void main(String[] args) {
 *         int[] arr = {2, 3, 4, 10, 40};
 *         int key = 10;
 *         int result = Arrays.binarySearch(arr, key);
 *
 *         if (result >= 0)
 *             System.out.println("Element found at index: " + result);
 *         else
 *             System.out.println("Element not found");
 *     }
 * }
 * ```
 *
 * ### 7. **Sorting an Array (Bubble Sort)**
 * Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
 *
 * **Program:**
 * ```java
 * public class BubbleSort {
 *     public static void main(String[] args) {
 *         int[] arr = {64, 34, 25, 12, 22, 11, 90};
 *         int n = arr.length;
 *
 *         for (int i = 0; i < n - 1; i++) {
 *             for (int j = 0; j < n - i - 1; j++) {
 *                 if (arr[j] > arr[j + 1]) {
 *                     int temp = arr[j];
 *                     arr[j] = arr[j + 1];
 *                     arr[j + 1] = temp;
 *                 }
 *             }
 *         }
 *
 *         System.out.println("Sorted array:");
 *         for (int i : arr) {
 *             System.out.print(i + " ");
 *         }
 *     }
 * }
 * ```
 *
 * These examples cover a variety of fundamental programming concepts and algorithms.
 * Mastering these will not only help in interviews but also strengthen your overall
 * programming skills.
 */
public class Problems2 {
}
