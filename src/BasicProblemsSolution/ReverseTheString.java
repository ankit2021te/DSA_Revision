package BasicProblemsSolution;

/**
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
 */

public class ReverseTheString {

    public static void main(String[] args) {

        String input = "Ankit Singh";
        System.out.println("output is : "+reverseStringUsingStringBuilder(input));
    }

    private static String reverseString(String input){
        String result="";
        char[] charArray = input.toCharArray();
        for(int i=charArray.length-1;i>=0;i--){
            result+=charArray[i];
        }
        return result;

    }

    private static String reverseStringUsingStringBuffer(String input){
        StringBuffer output = new StringBuffer(input);
        return output.reverse().toString();
    }

    private static String reverseStringUsingCharAt(String input){
        String result="";
        for(int i=input.length()-1;i>=0;i--){
            result+=input.charAt(i);
        }
        return result;
    }

    private static String reverseStringUsingStringBuilder(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
