package com.ankit.dsa.basic;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Ankit Singh";
        ReverseString rs = new ReverseString();
        System.out.println("reverseStringUsingStringBuffer: "+rs.reverseStringUsingStringBuffer(input));
        System.out.println("reverseStringUsingStringBuilder: "+rs.reverseStringUsingStringBuilder(input));
        System.out.println("reverseStringUsingCharAt: "+rs.reverseStringUsingCharAt(input));
        System.out.println("reverseStringUsingCharArr: "+rs.reverseStringUsingCharArr(input));
        System.out.println("reverseStringUsingLambdaFunction: "+rs.reverseStringUsingLambdaFunction(input));

    }

    private String reverseStringUsingStringBuffer(String input){
        return (new StringBuffer(input).reverse()).toString();
    }

    private String reverseStringUsingStringBuilder(String input){
        return (new StringBuilder(input).reverse().toString());
    }

    private String reverseStringUsingCharAt(String input){
        String result = "";
        for(int i = input.length()-1;i>=0;i--){
            result+=input.charAt(i);
        }
        return result;
    }

    private String reverseStringUsingCharArr(String input){
        String result = "";
        char[] ch = input.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            result+=ch[i];
        }
        return result;
    }

    private String reverseStringUsingLambdaFunction(String input){
        String result = "";
//        ReverseStringUsingLambda reverser = inputa->new StringBuilder(inputa).reverse().toString();
        ReverseStringUsingLambda reverser = inputa -> {
            String result1 = "";
            for (int i = inputa.length() - 1; i >= 0; i--) {
                result1 += inputa.charAt(i);
            }
            return result1;
        };

        result = reverser.reverse(input);
        return result;
    }
}

interface ReverseStringUsingLambda{
    String reverse(String input);
}
