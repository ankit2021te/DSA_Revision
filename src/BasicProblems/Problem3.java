package BasicProblems;

/**
 * Sure, here are some common Java interview programs that test various aspects of programming, such as logic, data structures, and algorithms. These examples cover a range of difficulties and are frequently asked in interviews.
 *
 * ### 1. Fibonacci Series
 * Print the Fibonacci series up to a given number `n`.
 *
 * ```java
 * public class FibonacciSeries {
 *     public static void main(String[] args) {
 *         int n = 10; // or take user input
 *         int a = 0, b = 1, c;
 *         System.out.print(a + " " + b);
 *
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
 * ### 2. Check if a Number is Prime
 * Determine if a given number is prime.
 *
 * ```java
 * public class PrimeCheck {
 *     public static void main(String[] args) {
 *         int num = 29; // or take user input
 *         boolean isPrime = true;
 *
 *         for (int i = 2; i <= Math.sqrt(num); i++) {
 *             if (num % i == 0) {
 *                 isPrime = false;
 *                 break;
 *             }
 *         }
 *
 *         if (isPrime) {
 *             System.out.println(num + " is a prime number.");
 *         } else {
 *             System.out.println(num + " is not a prime number.");
 *         }
 *     }
 * }
 * ```
 *
 * ### 3. Reverse a String
 * Reverse a given string.
 *
 * ```java
 * public class ReverseString {
 *     public static void main(String[] args) {
 *         String str = "hello"; // or take user input
 *         String reversed = new StringBuilder(str).reverse().toString();
 *         System.out.println("Reversed string: " + reversed);
 *     }
 * }
 * ```
 *
 * ### 4. Factorial of a Number
 * Calculate the factorial of a given number using recursion.
 *
 * ```java
 * public class Factorial {
 *     public static void main(String[] args) {
 *         int num = 5; // or take user input
 *         System.out.println("Factorial of " + num + " is " + factorial(num));
 *     }
 *
 *     public static int factorial(int n) {
 *         if (n == 0) {
 *             return 1;
 *         } else {
 *             return n * factorial(n - 1);
 *         }
 *     }
 * }
 * ```
 *
 * ### 5. Palindrome Check
 * Check if a given string is a palindrome.
 *
 * ```java
 * public class PalindromeCheck {
 *     public static void main(String[] args) {
 *         String str = "madam"; // or take user input
 *         boolean isPalindrome = isPalindrome(str);
 *         System.out.println(str + " is " + (isPalindrome ? "" : "not ") + "a palindrome.");
 *     }
 *
 *     public static boolean isPalindrome(String str) {
 *         int start = 0, end = str.length() - 1;
 *         while (start < end) {
 *             if (str.charAt(start) != str.charAt(end)) {
 *                 return false;
 *             }
 *             start++;
 *             end--;
 *         }
 *         return true;
 *     }
 * }
 * ```
 *
 * ### 6. Merge Two Sorted Arrays
 * Merge two sorted arrays into a single sorted array.
 *
 * ```java
 * import java.util.Arrays;
 *
 * public class MergeSortedArrays {
 *     public static void main(String[] args) {
 *         int[] arr1 = {1, 3, 5, 7};
 *         int[] arr2 = {2, 4, 6, 8};
 *         int[] mergedArray = mergeArrays(arr1, arr2);
 *         System.out.println("Merged array: " + Arrays.toString(mergedArray));
 *     }
 *
 *     public static int[] mergeArrays(int[] arr1, int[] arr2) {
 *         int[] result = new int[arr1.length + arr2.length];
 *         int i = 0, j = 0, k = 0;
 *
 *         while (i < arr1.length && j < arr2.length) {
 *             if (arr1[i] < arr2[j]) {
 *                 result[k++] = arr1[i++];
 *             } else {
 *                 result[k++] = arr2[j++];
 *             }
 *         }
 *
 *         while (i < arr1.length) {
 *             result[k++] = arr1[i++];
 *         }
 *
 *         while (j < arr2.length) {
 *             result[k++] = arr2[j++];
 *         }
 *
 *         return result;
 *     }
 * }
 * ```
 *
 * ### 7. Find the Duplicate Number
 * Find a duplicate number in an array containing n+1 integers where each integer is between 1 and n (inclusive).
 *
 * ```java
 * public class FindDuplicate {
 *     public static void main(String[] args) {
 *         int[] nums = {1, 3, 4, 2, 2};
 *         System.out.println("Duplicate number: " + findDuplicate(nums));
 *     }
 *
 *     public static int findDuplicate(int[] nums) {
 *         int slow = nums[0];
 *         int fast = nums[0];
 *
 *         do {
 *             slow = nums[slow];
 *             fast = nums[nums[fast]];
 *         } while (slow != fast);
 *
 *         fast = nums[0];
 *         while (slow != fast) {
 *             slow = nums[slow];
 *             fast = nums[fast];
 *         }
 *
 *         return slow;
 *     }
 * }
 * ```
 *
 * ### 8. Binary Search
 * Implement binary search on a sorted array.
 *
 * ```java
 * public class BinarySearch {
 *     public static void main(String[] args) {
 *         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 *         int target = 5;
 *         int result = binarySearch(arr, target);
 *         System.out.println("Element found at index: " + result);
 *     }
 *
 *     public static int binarySearch(int[] arr, int target) {
 *         int left = 0, right = arr.length - 1;
 *         while (left <= right) {
 *             int mid = left + (right - left) / 2;
 *
 *             if (arr[mid] == target) {
 *                 return mid;
 *             }
 *
 *             if (arr[mid] < target) {
 *                 left = mid + 1;
 *             } else {
 *                 right = mid - 1;
 *             }
 *         }
 *         return -1; // Element not found
 *     }
 * }
 * ```
 *
 * ### 9. Find the Missing Number
 * Find the missing number in an array containing n-1 integers where each integer is between 1 and n.
 *
 * ```java
 * public class MissingNumber {
 *     public static void main(String[] args) {
 *         int[] nums = {3, 7, 1, 2, 8, 4, 5};
 *         int missingNumber = findMissingNumber(nums);
 *         System.out.println("Missing number: " + missingNumber);
 *     }
 *
 *     public static int findMissingNumber(int[] nums) {
 *         int n = nums.length + 1;
 *         int sum = n * (n + 1) / 2;
 *         int arraySum = 0;
 *         for (int num : nums) {
 *             arraySum += num;
 *         }
 *         return sum - arraySum;
 *     }
 * }
 * ```
 *
 * ### 10. Find the Intersection of Two Arrays
 * Find the intersection of two arrays.
 *
 * ```java
 * import java.util.HashSet;
 * import java.util.Set;
 *
 * public class ArrayIntersection {
 *     public static void main(String[] args) {
 *         int[] arr1 = {1, 2, 2, 1};
 *         int[] arr2 = {2, 2};
 *         int[] intersection = findIntersection(arr1, arr2);
 *         for (int num : intersection) {
 *             System.out.print(num + " ");
 *         }
 *     }
 *
 *     public static int[] findIntersection(int[] nums1, int[] nums2) {
 *         Set<Integer> set1 = new HashSet<>();
 *         for (int num : nums1) {
 *             set1.add(num);
 *         }
 *
 *         Set<Integer> intersection = new HashSet<>();
 *         for (int num : nums2) {
 *             if (set1.contains(num)) {
 *                 intersection.add(num);
 *             }
 *         }
 *
 *         int[] result = new int[intersection.size()];
 *         int i = 0;
 *         for (int num : intersection) {
 *             result[i++] = num;
 *         }
 *         return result;
 *     }
 * }
 * ```
 *
 * These programs cover a variety of common problems and should help you prepare for Java coding
 * interviews.
 */
public class Problem3 {
}
