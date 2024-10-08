package com.ankit.dsa.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArrayProblem {

    public static void main(String[] args) {

        int[] inputArray = {10, 20, 5, 6, 4, 3, 33, 2, 200, 1};
//        sortArray(inputArray);
//        sortedArrayUsingArrays(inputArray);
        printArray(inputArray);
        System.out.println("*************************");
        sortArrayUsingInsertionSort(inputArray);
        printArray(inputArray);

    }

    private static void printArray(int[] inputArray) {
        for (int i : inputArray) {
            System.out.print(i + " ,");
        }
    }

    private static void sortedArrayUsingArrays(int[] inputArray) {
        System.out.println("Unsorted Array");
        printArray(inputArray);
        System.out.println();
        System.out.println("Sorted Array");
//        Arrays.sort(inputArray);
        inputArray = Arrays.stream(inputArray).sorted().toArray();
        printArray(inputArray);
    }

    private static void sortArray(int[] arr) {
        if (arr.length == 0)
            return;
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        /*int a = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=a){
                sortedArray.add(arr[i]);
            }else if(arr[i]>a){
                a= arr[i];
            }
        }*/

        for (int j = 0; j < arr.length; j++) {
            int result = arr[j];
            for (int i = j + 1; i < arr.length; i++) {
            /*if(result<=arr[i])
            {
                result = arr[i];
                sortedArray.add(result);
            }*/
                if (result >= arr[i]) {
                    result = arr[i];
                }
            }
            sortedArray.add(result);
        }
        System.out.println("sortedArray: " + sortedArray);
        System.out.println("************************");
    }

    private static void sortArrayUsingBubbleSort(int[] arr) {
        // time complexity O(n2)
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void sortArrayUsingSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    private static void sortArrayUsingInsertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1]= arr[j];
            }
            arr[j+1]=key;
        }
    }

}
