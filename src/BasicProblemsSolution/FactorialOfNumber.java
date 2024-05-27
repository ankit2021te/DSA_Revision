package BasicProblemsSolution;

/**
 * Write a program to calculate the factorial of a given number.
 * a function that multiplies a number by every number below it till 1.
 */

public class FactorialOfNumber {
    public static void main(String[] args) {
        int input=10;
        System.out.println("For input "+input+" the factorial is "+factorialIterativeApproach(input));

        fact(input);
    }

    private static int factorialIterativeApproach(int input){
       // 1*2*3*4*5*6*7*8*9*10
        int result=1;
        for(int i=1;i<=input;++i){
            result*=(i);
        }
        return result;
    }

    private static void fact(int input){
        long factorial = 1;
          for (int i = 1; i <= input; ++i) {
              factorial *= i;
         }
          System.out.println("Factorial of " + input + " is " + factorial);
    }
}


/**
 * public class Factorial {
 *  *     public static void main(String[] args) {
 *  *         int num = 5; // number to find the factorial of
 *  *         long factorial = 1;
 *  *         for (int i = 1; i <= num; ++i) {
 *  *             factorial *= i;
 *  *         }
 *  *         System.out.println("Factorial of " + num + " is " + factorial);
 *  *     }
 *  * }
 */