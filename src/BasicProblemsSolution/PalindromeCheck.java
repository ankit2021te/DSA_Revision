package BasicProblemsSolution;

/**
 * Write a program to check if a string is a palindrome.
 * A string is said to be palindrome if it remains the same on reading from both ends
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        String input="abcba";
        System.out.println(" isPalindrome : "+isPalindrome(input));
        System.out.println("isPalindromeRecursive : "+isPalindromeRecursive(input,0,input.length()-1));
    }

    private static boolean isPalindrome(String input){
        for(int i=0;i<(input.length())/2;i++){ // Big O: T.C = O(n/2)== O(n)
            if(input.charAt(i)!=input.charAt((input.length()-1)-i)){
                return false;
            }
        }
        return true;
    }


    // T.C: O(n)
    // S.C: O(n)
    private static boolean isPalindromeRecursive(String input,int start,int end){
        if(start>=end){
            return true;
        }
        if(input.charAt(start)!=input.charAt(end))
            return false;
        return isPalindromeRecursive(input,start+1,end-1);
    }
}
/**
public class Palindrome {
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
 */