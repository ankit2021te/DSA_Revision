package com.ankit.dsa.basic;

public class ArmstrongProblem {

    public static void main(String[] args) {

        int input = 9474;//153,370
        System.out.println("isArmstrongNumber: "+isArmstrongNumber(input));
    }

    private static boolean isArmstrongNumber(int inputValue){

        int input = inputValue;
        int length = String.valueOf(input).length();
        int result = 0;
        while(input>0){
            int temp = input%10;// 3,5,1
            result = (int) (result +Math.pow(temp,length));// 0+3^3=27,27+5^3=152,152+1^3=153
            input=input/10;// 15,1
        }
        return result == inputValue;
    }
}
