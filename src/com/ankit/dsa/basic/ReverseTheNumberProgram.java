package com.ankit.dsa.basic;

public class ReverseTheNumberProgram {

    public static void main(String[] args) {

        int number = 15433;
        System.out.println("reverseTheNumber: "+reverseTheNumber(number));

    }

    private static int reverseTheNumber(int input){
        int result = 0;
        while(input>0){
            int length = String.valueOf(input).length();
            System.out.println("length: "+length);
            int a = input%10;
            System.out.println("a: "+a);
//            int b = (int) (Math.pow(a,10*length));
//            System.out.println("b: "+b);
            result = result*10 + a;
            System.out.println("result: "+result);
            input= input/10;
            System.out.println("input: "+input);
        }
        return result;
    }
}
