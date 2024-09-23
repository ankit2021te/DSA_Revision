package com.ankit.dsa.basic;

public class CheckForPalindrome {

    public static void main(String[] args) {

        String input = "MAMAAMAM";
        System.out.println("output: "+isPalindrome(input));

    }

    private static boolean isPalindrome(String input) {
        int arrLength = input.length();
        for (int i = 0; i < (arrLength / 2); i++) {

            if (input.charAt(i) != input.charAt(arrLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
