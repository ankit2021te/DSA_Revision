package com.ankit.dsa.basic;

public class MergeTwoArray {

    public static void main(String[] args) {

        int[] arr1 = {1,4,8,12,16};
        int[] arr2 = {2,6,10,14,18};
        mergeTwoArray(arr1,arr2);

    }

    private static void mergeTwoArray(int[] arr1,int[] arr2){
        int length1 = arr1.length; //5
        System.out.println("Array1");
        printArray(arr1);
        int length2 = arr2.length; //5
        System.out.println();
        System.out.println("Array2");
        printArray(arr2);
        int newLength = length1+length2;
        int[] arr = new int[newLength];
        for(int i=0;i<newLength;i++){
            if(newLength-i>length1)
            {
                arr[i]=arr1[i];
            }else{
                arr[i]=arr2[i-length2];
            }
        }
        System.out.println();
        System.out.println("Merged Array");
        printArray(arr);
    }

    private static void printArray(int[] arr){
        for (int a : arr)
            System.out.print(a+" , ");
    }
}
