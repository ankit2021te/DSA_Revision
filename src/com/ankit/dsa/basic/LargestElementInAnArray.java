package com.ankit.dsa.basic;

public class LargestElementInAnArray {

    public static void main(String[] args) {

        int[] arr = {10,1,11,22,33,5000,44,55};
        System.out.println("result: "+findLargestNumber(arr));
        System.out.println();
        System.out.println("Based on index: "+findLargestNumberBasedOnIndex(arr,33));
    }

    private static int findLargestNumber(int[] arr){
        int result = arr[0];
        for (int i=0;i<arr.length;i++){
            if(result<arr[i]){
                result=arr[i];
            }
        }
        return result;
    }

    private static int findLargestNumberBasedOnIndex(int[] arr,int index){
        System.out.println("Before:");
        System.out.println();
        printArray(arr);
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp= arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println("After: ");
        printArray(arr);
        return arr[arr.length-index];
    }

    private static void printArray(int[] arr){
        for (int a : arr)
            System.out.print(a+" , ");
    }
}
