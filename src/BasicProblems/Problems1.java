package BasicProblems;

/**
 * Preparing for Java interview programs involves understanding fundamental concepts, common problems, and writing efficient, clean code. Here are some typical Java interview programs and concepts to practice:
 *
 * ### 1. Fibonacci Series
 * Write a program to generate the first n Fibonacci numbers.
 * ```java
 * public class Fibonacci {
 *     public static void main(String[] args) {
 *         int n = 10; // number of Fibonacci numbers to generate
 *         int a = 0, b = 1, c;
 *         System.out.print(a + " " + b);
 *         for (int i = 2; i < n; i++) {
 *             c = a + b;
 *             System.out.print(" " + c);
 *             a = b;
 *             b = c;
 *         }
 *     }
 * }
 * ```
 *
 * ### 2. Factorial of a Number
 * Write a program to calculate the factorial of a given number.
 * ```java
 * public class Factorial {
 *     public static void main(String[] args) {
 *         int num = 5; // number to find the factorial of
 *         long factorial = 1;
 *         for (int i = 1; i <= num; ++i) {
 *             factorial *= i;
 *         }
 *         System.out.println("Factorial of " + num + " is " + factorial);
 *     }
 * }
 * ```
 *
 * ### 3. Palindrome Check
 * Write a program to check if a string is a palindrome.
 * ```java
 * public class Palindrome {
 *     public static void main(String[] args) {
 *         String str = "radar";
 *         boolean isPalindrome = true;
 *         int len = str.length();
 *         for (int i = 0; i < len / 2; i++) {
 *             if (str.charAt(i) != str.charAt(len - 1 - i)) {
 *                 isPalindrome = false;
 *                 break;
 *             }
 *         }
 *         if (isPalindrome) {
 *             System.out.println(str + " is a palindrome.");
 *         } else {
 *             System.out.println(str + " is not a palindrome.");
 *         }
 *     }
 * }
 * ```
 *
 * ### 4. Reverse a String
 * Write a program to reverse a given string.
 * ```java
 * public class ReverseString {
 *     public static void main(String[] args) {
 *         String str = "hello";
 *         String reversed = "";
 *         for (int i = str.length() - 1; i >= 0; i--) {
 *             reversed += str.charAt(i);
 *         }
 *         System.out.println("Reversed string: " + reversed);
 *     }
 * }
 * ```
 *
 * ### 5. Prime Number Check
 * Write a program to check if a number is a prime.
 * ```java
 * public class PrimeCheck {
 *     public static void main(String[] args) {
 *         int num = 29;
 *         boolean isPrime = true;
 *         for (int i = 2; i <= Math.sqrt(num); i++) {
 *             if (num % i == 0) {
 *                 isPrime = false;
 *                 break;
 *             }
 *         }
 *         if (isPrime) {
 *             System.out.println(num + " is a prime number.");
 *         } else {
 *             System.out.println(num + " is not a prime number.");
 *         }
 *     }
 * }
 * ```
 *
 * ### 6. Sorting an Array
 * Write a program to sort an array using Bubble Sort.
 * ```java
 * import java.util.Arrays;
 *
 * public class BubbleSort {
 *     public static void main(String[] args) {
 *         int[] arr = {5, 2, 9, 1, 5, 6};
 *         bubbleSort(arr);
 *         System.out.println("Sorted array: " + Arrays.toString(arr));
 *     }
 *
 *     public static void bubbleSort(int[] arr) {
 *         int n = arr.length;
 *         boolean swapped;
 *         for (int i = 0; i < n - 1; i++) {
 *             swapped = false;
 *             for (int j = 0; j < n - 1 - i; j++) {
 *                 if (arr[j] > arr[j + 1]) {
 *                     int temp = arr[j];
 *                     arr[j] = arr[j + 1];
 *                     arr[j + 1] = temp;
 *                     swapped = true;
 *                 }
 *             }
 *             if (!swapped) break; // if no two elements were swapped, the array is sorted
 *         }
 *     }
 * }
 * ```
 *
 * ### 7. Remove Duplicates from an Array
 * Write a program to remove duplicates from an array.
 * ```java
 * import java.util.Arrays;
 * import java.util.HashSet;
 * import java.util.Set;
 *
 * public class RemoveDuplicates {
 *     public static void main(String[] args) {
 *         int[] arr = {1, 2, 2, 3, 4, 4, 5};
 *         int[] result = removeDuplicates(arr);
 *         System.out.println("Array without duplicates: " + Arrays.toString(result));
 *     }
 *
 *     public static int[] removeDuplicates(int[] arr) {
 *         Set<Integer> set = new HashSet<>();
 *         for (int num : arr) {
 *             set.add(num);
 *         }
 *         int[] result = new int[set.size()];
 *         int i = 0;
 *         for (int num : set) {
 *             result[i++] = num;
 *         }
 *         return result;
 *     }
 * }
 * ```
 *
 * ### 8. Merge Two Sorted Arrays
 * Write a program to merge two sorted arrays into a single sorted array.
 * ```java
 * import java.util.Arrays;
 *
 * public class MergeSortedArrays {
 *     public static void main(String[] args) {
 *         int[] arr1 = {1, 3, 5, 7};
 *         int[] arr2 = {2, 4, 6, 8};
 *         int[] mergedArray = merge(arr1, arr2);
 *         System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
 *     }
 *
 *     public static int[] merge(int[] arr1, int[] arr2) {
 *         int[] merged = new int[arr1.length + arr2.length];
 *         int i = 0, j = 0, k = 0;
 *         while (i < arr1.length && j < arr2.length) {
 *             if (arr1[i] <= arr2[j]) {
 *                 merged[k++] = arr1[i++];
 *             } else {
 *                 merged[k++] = arr2[j++];
 *             }
 *         }
 *         while (i < arr1.length) {
 *             merged[k++] = arr1[i++];
 *         }
 *         while (j < arr2.length) {
 *             merged[k++] = arr2[j++];
 *         }
 *         return merged;
 *     }
 * }
 * ```
 *
 * ### 9. Find the Largest and Smallest Number in an Array
 * Write a program to find the largest and smallest number in an array.
 * ```java
 * public class FindMinMax {
 *     public static void main(String[] args) {
 *         int[] arr = {3, 5, 7, 2, 8, -1, 4, 10, 12};
 *         int max = arr[0];
 *         int min = arr[0];
 *
 *         for (int i = 1; i < arr.length; i++) {
 *             if (arr[i] > max) {
 *                 max = arr[i];
 *             }
 *             if (arr[i] < min) {
 *                 min = arr[i];
 *             }
 *         }
 *
 *         System.out.println("Largest number is " + max);
 *         System.out.println("Smallest number is " + min);
 *     }
 * }
 * ```
 *
 * ### 10. Find the Second Largest Number in an Array
 * Write a program to find the second largest number in an array.
 * ```java
 * public class SecondLargest {
 *     public static void main(String[] args) {
 *         int[] arr = {12, 35, 1, 10, 34, 1};
 *         int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
 *
 *         for (int i = 0; i < arr.length; i++) {
 *             if (arr[i] > first) {
 *                 second = first;
 *                 first = arr[i];
 *             } else if (arr[i] > second && arr[i] != first) {
 *                 second = arr[i];
 *             }
 *         }
 *
 *         System.out.println("The second largest number is " + second);
 *     }
 * }
 * ```
 *
 * These programs cover basic concepts and algorithms frequently asked about in Java interviews.
 * Be sure to understand the logic behind each solution, practice writing clean and efficient code,
 * and consider edge cases.
 */
public class Problems1 {
}
